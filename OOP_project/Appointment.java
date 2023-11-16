
import java.util.Scanner;

public class Appointment {
    Scanner input = new Scanner(System.in);
    static int sel = 0;
    static int sel1 = 0;
    static int sel2 = 0;

    private String AppointmentID;
    private Patient AppointmentPatient; // will store patient type object
    private Doctor AppointmentDoctor; // will store Doctor type Object
    private String AppointmentDate; // Google how to use Date Class
    private String Appointmenttime; // String type to be set by user
    private String Status; // can either be Pending, Finished or Cancelled;

    public void ScheduleAppointment(String AppointmentID, Patient AppointmentPatient, Doctor AppointmentDoctor) {
        System.out.println("SCHEDULE APPOINTMENT SECTION");
        this.AppointmentID = AppointmentID;
        this.AppointmentPatient = AppointmentPatient;
        this.AppointmentDoctor = AppointmentDoctor;
        System.out.println("Enter the Date you want to take the Appointment from Doctor ");
        AppointmentDate = input.nextLine();
        System.out.println("Enter appointment time : ");
        Appointmenttime= input.nextLine();
        
        Status = "Pending";
        // set the details of the appointment
    }

    public void UpdateAppointment() {
        // primary menu for update appointment
        System.out.println("APPOINTMENT UPDATE SECTION");
        System.out.println("Choose what you want to change");
        System.out.println("Press 1 to change the STATUS");
        System.out.println("Press 2 to change the date of Appointment");
        // getting choice from the user
        sel = input.nextInt();
        if (sel == 1) {
            // secondary menu for update section
            System.out.println("APPOINTMENT STATUS UPDATE SECTION\n");
            System.out.println("Appointment ID :" + AppointmentID);
            System.out.println("Choose the options to update Appointment Status");
            System.out.println("Press 1 to mark the Appointment PENDING");
            System.out.println("Press 2 to mark the Appointment FINISHED");
            System.out.println("Press 3 to mark the Appointment CANCELED");
            sel1 = input.nextInt();
            if (sel1 == 1) {
                this.Status = "Pending";
                System.out.println("Status Successfully Updated to be " + Status);
            } else if (sel1 == 2) {
                this.Status = "Finished";
                System.out.println("Status Successfully Updated to be " + Status);
            } else if (sel1 == 3) {
                this.Status = "Canceled";
                System.out.println("Status Successfully Updated to be " + Status);
            }
            // Update any information aobut the appointment if needed :
        } else if (sel == 2) {
            System.out.println("APPOINTMENT DATE CHANGE SECTION");
        }
    }

    public void CancelAppointment() {
        System.out.println("APPOINTMENT CANCELLATION SECTION\n");
        System.out.println("Press 1 to cancel the Appointment");
        sel2 = input.nextInt();
        if (sel2 == 1) {
            this.Status = "CANCELLED : ";
            System.out.println("Status Successfully Updated to be " + Status);
        }

        // Mark the Status of the Appointment as "CANCELLED"

    }
    public void ViewAppointment()
    {   System.out.println(AppointmentID);
        System.out.println(AppointmentPatient);
        System.out.println(AppointmentDoctor);
        System.out.println("Date : " + AppointmentDate + ",Time : "+ Appointmenttime);
    }

}
