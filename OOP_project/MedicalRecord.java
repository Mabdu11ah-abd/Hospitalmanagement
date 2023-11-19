import java.util.ArrayList;
import java.util.Scanner;

public class MedicalRecord {
    private String admissionDate;
    private String dischargeDate;
    private String Notes;
    private ArrayList<Prescription> prescriptions; // As Prescription is another class

    public void editRecord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter admission Date : ");
        admissionDate = input.nextLine();
        System.out.println("Enter discharge Date, Enter Admitted if not discharged : ");
        dischargeDate = input.nextLine();
        System.out.println("Enter Notes on patient :");
        Notes = input.nextLine();
    }

    // Method to add a prescription to the medical record
    public void addPrescription(Prescription prescription) {
        if (!prescriptions.contains(prescription)) {
            prescriptions.add(prescription);
            System.out.println("Prescription added"); // getter of details present in prescript
        } else {
            System.out.println("Cannot add prescription. The patient is either discharged or not admitted.");
        }
    }

    // Method to get data of all or latest prescription of the patient.
    public void viewMedicalRecord() {
        System.out.println(
                "Admission Date : " + admissionDate + "\nDischarge Date : " + dischargeDate + "\nNotes : " + Notes);
        System.out.println("Enter 1 to see all prescriptions \nEnter 2 to see latest prescription");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {
            if(prescriptions.isEmpty())
            {
                System.out.println("There are prescriptions : ");
                return;
            }
            for (int i = 0; i < prescriptions.size(); i++) {
                System.out.println(prescriptions.get(i));
            }
        } else if (choice == 2) {
             if(prescriptions.isEmpty())
            {
                System.out.println("There are prescriptions : ");
                return;
            }
            int latestPrescription = prescriptions.size() - 1;
            System.out.println(prescriptions.get(latestPrescription));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}