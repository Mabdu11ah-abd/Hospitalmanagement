import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
    private String Name;
    private String ID;
    private ArrayList<Patient> Patients = new ArrayList<>(20);

    public void WritePrescription() {
    //TODO: To be done by Junaid
    



    }

    public void UpdatePatientNotes() {
    //TODO: Abdullah Task : 
    
    
    
    }

    public void ScheduleAppointment() {
    //TODO :  Abdullah Task: 




    }

    public void assignpatients(ArrayList <Patient> Addpatients) {
        //TODO :  Abdullah Task : 
        Scanner input = new Scanner(System.in);
        System.out.println("How many patients Do you want to assign to the doctor : ");
        int Num = input.nextInt();
        for (int i = 0; i < Num; i++) {
            System.out.println("Enter the ID of Patient you want to add : ");
            
        }


    }

    public void ViewPatients() {
        //TODO : To be done by junaid :
        //simply print all the data of patient after searching for patient by first searching for id 
        //then use display patient method to display the patient : 
    
    
    
    }

    public void SetDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        Name = input.nextLine();
        System.out.println("Enter the doctors ID : ");
        ID=input.nextLine();
    }
    //search patients method to be used whenever searching by id is required 
    private boolean searchPatients(String id)
    {
    for (Patient patient : Patients) {
        if(patient.getID() == id)
        return true;
    }
    return false;
    }

}
