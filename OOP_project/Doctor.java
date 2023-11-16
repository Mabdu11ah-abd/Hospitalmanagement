import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
    private String Name;
    private String ID;
    private ArrayList<Patient> Patients = new ArrayList<>(20);
    private ArrayList<Appointment> appointments= new ArrayList<>();

    public void WritePrescription(Prescription nPrescription) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the ID of the patient whos ID prescription you want to write : ");
        System.out.println("Enter the ID of the patient whos data you want to update : ");
        String searchID = input.nextLine();
        if (searchPatients(searchID) != -1)
        {
            Patients.get(searchPatients(searchID)).getPatientprescription().newPrescription(this, Patients.get(searchPatients(searchID)));
        }
        else 
        {
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
    public void ScheduleAppointment()
    {
        
    }
    public void assignpatients(ArrayList<Patient> Addpatients) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many patients Do you want to assign to the doctor : ");
        int Num = input.nextInt();
        for (int i = 0; i < Num; i++) {
            System.out.println("Enter the ID of Patient you want to add : ");
             String searchID = input.nextLine();
            if (searchPatients(searchID) != -1) 
            {
                Patients.add(Addpatients.get(searchPatients(searchID)));
            }
            else{
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
            }
            else 
            {
                System.out.println("Invalid ID entered : ");
            }

        } else if (choice == 2) {
            {
                for (Patient  patient : Patients ) {
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
        Name = input.nextLine();
        System.out.println("Enter the doctors ID : ");
        ID = input.nextLine();
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
    //*Getter and setter methods for the class  */
        public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return "Doctor [Name=" + Name + ", ID=" + ID + "]";
    }
}
