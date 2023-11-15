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

    public void assignpatients(ArrayList <Patient> Addpatients) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many patients Do you want to assign to the doctor : ");
        int Num = input.nextInt();
        for (int i = 0; i < Num; i++) {
            System.out.println("Enter the ID of Patient you want to add : ");
            
        }


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
