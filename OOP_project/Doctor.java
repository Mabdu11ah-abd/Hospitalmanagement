import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends User {
    private String Specialization;

    public String getSpecialization() {
        return Specialization;
    }

    private ArrayList<Patient> Patients = new ArrayList<>(20);
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void WritePrescription() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ID of the patient whos ID prescription you want to write : ");
        System.out.println("Enter the ID of the patient whos data you want to update : ");
        String searchID = input.nextLine();
        if (searchPatients(searchID) != -1) {
            Prescription temPrescription = new Prescription(this, Patients.get(searchPatients(searchID)));
            Patients.get(searchPatients(searchID)).getRecord().addPrescription(temPrescription);
        } else {
            System.out.println("Wrong ID has been entered");
        }
    }

    public void UpdatePatientNotes() {
        Scanner input = new Scanner(System.in);// scanner variable

        // input validation for patient id
        System.out.println("Enter the ID of the patient whos data you want to update : ");
        String searchID = input.nextLine();
        if (searchPatients(searchID) != -1) {
            System.out.print("Enter patient name : ");
            String tempname = input.nextLine();
            System.out.print("Enter Patient Age : ");
            int tempAge = input.nextInt();
            System.out.print("Enter current status of pateint : ");
            input.nextLine();
            String tempStatus = input.nextLine();
            System.out.println("Enter current Address : ");
            String tempAddress = input.nextLine();
            Patients.get(searchPatients(searchID)).updatePatient(tempname, tempAge, tempStatus, tempAddress);
        } else {
            System.out.println("Patient ID does not exist : ");
        }

    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void assignpatients(ArrayList<Patient> Addpatients) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many patients Do you want to assign to the doctor : ");
        int Num = input.nextInt();
        for (int i = 0; i < Num; i++) {
            System.out.println("Enter the ID of Patient you want to add : ");
            String searchID = input.nextLine();
            if (searchPatients(searchID) != -1) {
                Patients.add(Addpatients.get(searchPatients(searchID)));
            } else {
                System.out.println("Invalid ID entered, enter your ID again : ");
                i--;
            }
        }
    }

    public void ViewPatients() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 to view patient by ID : \nEnter 2 to view all patients : ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Enter the ID of the patient whos data you want to view : ");
            String searchID = input.nextLine();
            if (searchPatients(searchID) != -1) {
                Patients.get(searchPatients(searchID)).DisplayPatient();
            } else {
                System.out.println("Invalid ID entered : ");
            }

        } else if (choice == 2) {
            {
                for (Patient patient : Patients) {
                    patient.DisplayPatient();
                }
            }

        } else {
            System.out.println("Invalid Choice : ");
        }

    }

    public void SetDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = input.nextLine();
        System.out.println("Enter the doctors ID : ");
        ID = input.nextLine();
    }

    public void ManageAppointments() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to view upcoming appointments");
        System.out.println("Enter 2 to view all appointments (including completed and cancelled)");
        System.out.println("Enter 3 to CancelAppointments : ");
        while (true) {
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Upcoming Appointments:");
                for (Appointment appointment : appointments) {
                    if (appointment.getStatus().equals("PENDING")) {
                        appointment.ViewAppointment();
                    }
                }
            } else if (choice == 2) {
                System.out.println("All Appointments:");
                for (Appointment appointment : appointments) {
                    appointment.ViewAppointment();
                }
            } else if (choice == 3) {
                System.out.println("Enter ID of the Appointment you want to mark as Finished : ");
                String cancelAppointmentID = input.nextLine();
                for (Appointment appointment : appointments) {
                    if (appointment.getAppointmentID().equals(cancelAppointmentID)) {
                        appointment.CancelAppointment();
                        System.out.println("Appointment Cancelled");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid Choice");
            }
            // Remove completed or cancelled appointments
            ArrayList<Appointment> appointmentsToRemove = new ArrayList<>();
            for (Appointment appointment : appointments) {
                if (appointment.getStatus().equals("FINISHED") || appointment.getStatus().equals("CANCELLED")) {
                    appointmentsToRemove.add(appointment);
                }
            }
            appointments.removeAll(appointmentsToRemove);
        }
    }

    // search patients method to be used whenever searching by id is required
    private int searchPatients(String id) {
        for (int index = 0; index < Patients.size(); index++) {
            if (Patients.get(index).getID() == id) {
                return index;
            }
        }
        return -1;
    }

    // *Getter and setter methods for the class */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return "Doctor [Name= " + name + ",Specialization=" + Specialization + "]";
    }

}
