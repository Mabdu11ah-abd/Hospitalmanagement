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
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the ID of the patient whos data you want to update : ");
    String searchID= input.nextLine();
    if (searchPatients(searchID)!=-1) {
        System.out.print("Enter patient name : ");
        String tempname = input.nextLine();
        System.out.print("Enter Patient Age : ");
        int tempAge= input.nextInt();

        Patients.get(searchPatients(searchID)).updatePatient(searchID, 0, searchID, searchID);;

        
    } else {
        
    }


    
    
    
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
    private int searchPatients(String id)
    {
    for (int index = 0; index < Patients.size(); index++) {
        if(Patients.get(index).getID()==id)
        {
            return index;
        }
    }
    return -1;
    }

}
