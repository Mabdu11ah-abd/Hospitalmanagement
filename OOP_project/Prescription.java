import java.util.Date;
import java.util.Scanner;

public class Prescription {
    Doctor Practitioner;
    Patient prescribedto;
    private String medicines;
    private Date PrescriptionDate;

    public void DisplayPrescription(Patient p, Doctor d) {
        System.out.println("Doctor Appointed :" + Practitioner.getName() + "\n" + Practitioner.getID);
        System.out.println("Patient INFO");
        System.out.println("Patient Name :" + prescribedto.getName());
        System.out.println("Patient ID :" + prescribedto.getID());
        System.out.println("Patient Status :" + prescribedto.getStatus());
        System.out.println("Doctor INFO ");

        System.out.println("Prescribed Medicines : \n" + medicines );
        System.out.println("Prescribed Date to patient :" + PrescriptionDate);
        
    }

    public void UpdatePrescription()

    {
        Scanner input = new Scanner(System.in);
        System.out.println("PRESCRIPTION UPDATE SECTION");
        System.out.println("What do you want to update");
        System.out.println("1-Update Medicine");
        System.out.println("2-Update Prescribed Date");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Enter new Medicines");
            medicines = input.nextLine();
        } else if (choice == 2) {
            System.out.println("Enter new Prescribed date");
            // no idea how to us date :(

        }
    }

}