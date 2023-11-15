import java.util.Date;

public class Appointment {
    private String AppointmentID;
    private Patient AppointmentPatient; // will store patient type object
    private Doctor AppointmentDoctor; // will store Doctor type Object
    private Date AppointmentDate; // Google how to use Date Class
    private String Appointmenttime; // String type to be set by user
    private String Status; // can either be Pending, Finished or Cancelled;

    public void ScheduleAppointment() {
        // set the details of the appointment :

    }

    public void UpdateAppointment() {
       //Update any information  aobut the appointment if needed : 
       //Provide options to change time, status, or date : 
    }

    public void CancelAppointment() {
        // Mark the Status of the Appointment as "CANCELLED"

    }

}
