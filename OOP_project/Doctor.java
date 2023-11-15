import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
    private String Name;
    private String ID;
    private ArrayList<Patient> Patients = new ArrayList<>(20);

    public void WritePrescription() {
    }

    public void UpdatePatientNotes() {
    }

    public void ScheduleAppointment() {
    }

    public void assignpatients() {
        System.out.println("How many patients are assigned to the doctor : ");
        

    }

    public void ViewPatients() {
    }

    public void SetDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        Name = input.nextLine();
        System.out.println("Enter the doctors ID : ");
        ID=input.nextLine();
    }

}
