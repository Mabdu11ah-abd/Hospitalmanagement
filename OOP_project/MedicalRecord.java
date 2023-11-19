import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class MedicalRecord {
    private int age;
    private String admissionDate;
    private String dischargeDate;
    private String Notes;
    private ArrayList<Prescription> prescriptions; // As Prescription is another class

    // Getters and Setters for all fields
    public int getAge() {
        return age;
    }

    public MedicalRecord() {
    }

    public MedicalRecord(int age, String admissionDate) {
        setAge(age);
this.admissionDate=admissionDate;  
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getNotes() {
        return Notes;
    }

    public void setNotes(String record) {
        this.Notes = record;
    }
    
    // Method to update the patient's record
    public void updateRecord(String newRecord) {
        if (admissionDate != null && dischargeDate == null) {
            // Only allow updating record if the patient is currently admitted
            this.Notes = newRecord;
            System.out.println("Record updated: " + newRecord);
        } else {
            System.out.println("Cannot update record. The patient is either discharged or not admitted.");
        }
    }

    // Method to add a prescription to the medical record
    public void addPrescription(Prescription prescription) {
        if(!prescriptions.contains(prescription)){
            prescriptions.add(prescription);
            System.out.println("Prescription added"); //getter of details present in prescription class

        } else {
            System.out.println("Cannot add prescription. The patient is either discharged or not admitted.");
        }
    }
    //Method to get data of all or latest prescription of the patient.
    public void viewMedicalRecord() {
        System.out.println("Enter 1 to see all prescriptions \nEnter 2 to see latest prescription");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {
            for (int i = 0; i < prescriptions.size(); i++) {
                System.out.println(prescriptions.get(i));
            }
        } else if (choice == 2) {
            int latestPrescription =prescriptions.size()-1;
            System.out.println(prescriptions.get(latestPrescription));
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}