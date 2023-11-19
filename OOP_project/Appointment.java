
import java.util.Scanner;

public class Appointment {
    Scanner input = new Scanner(System.in);

    private String AppointmentID;
    private Patient AppointmentPatient; // will store patient type object
    private Doctor AppointmentDoctor; // will store Doctor type Object
    private String AppointmentDate; // Google how to use Date Class
    private String Appointmenttime; // String type to be set by user
    private String status; // can either be Pending, Finished or Cancelled;

    public void ScheduleAppointment(String AppointmentID, Patient AppointmentPatient, Doctor AppointmentDoctor) {
        System.out.println("SCHEDULE APPOINTMENT SECTION");
        this.AppointmentID = AppointmentID;
        this.AppointmentPatient = AppointmentPatient;
        this.AppointmentDoctor = AppointmentDoctor;
        System.out.println("Enter the Date you want to take the Appointment from Doctor ");
        AppointmentDate = input.nextLine();
        System.out.println("Enter appointment time : ");
        Appointmenttime= input.nextLine();

        status = "Pending";
        // set the details of the appointment
    }

    public void updateAppointment() {
        System.out.println("APPOINTMENT UPDATE SECTION");
        System.out.println("Choose what you want to change");
        System.out.println("Press 1 to change the STATUS");
        System.out.println("Press 2 to change the date of Appointment");

        int choice = input.nextInt();
        if (choice == 1) {
            updateStatus();
        } else if (choice == 2) {
            System.out.println("APPOINTMENT DATE CHANGE SECTION\n Enter new date: ");
            AppointmentDate = input.nextLine();
            System.out.println("Appointment date updated to: " + AppointmentDate);
        }
    }

    private void updateStatus() {
        System.out.println("APPOINTMENT STATUS UPDATE SECTION\n");
        System.out.println("Appointment ID: " + AppointmentID);
        System.out.println("Choose the options to update Appointment Status");
        System.out.println("Press 1 to mark the Appointment PENDING");
        System.out.println("Press 2 to mark the Appointment FINISHED");
        System.out.println("Press 3 to mark the Appointment CANCELED");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                status = "Pending";
                break;
            case 2:
                status = "Finished";
                break;
            case 3:
                status = "Cancelled";
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Status Updated to " + status);
    }

    public void CancelAppointment() {
        System.out.println("APPOINTMENT CANCELLATION SECTION");
            this.status = "CANCELLED";
            System.out.println("Status Successfully Updated to be " + status);
            // Mark the Status of the Appointment as "CANCELLED"
    }
    public void ViewAppointment()
    {   System.out.println(AppointmentID);
        System.out.println(AppointmentPatient);
        System.out.println(AppointmentDoctor);
        System.out.println("Date : " + AppointmentDate + ",Time : "+ Appointmenttime);
    }


}