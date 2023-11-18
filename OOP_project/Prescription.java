import java.util.Date;
import java.util.Scanner;

public class Prescription {
    Doctor Practitioner;
    Patient prescribedto;
    private String medicines;
    private Date PrescriptionDate;
    public Prescription(Doctor doctor, Patient patient) {
        Scanner input = new Scanner(System.in);

        // Set Doctor
        this.Practitioner = doctor;

        // Set Patient
        this.prescribedto = patient;

        // Set Medicines
        System.out.println("Enter Prescribed Medicines:");
        input.nextLine(); // consume the newline character
        this.medicines = input.nextLine();

        // Set Prescription Date
        this.PrescriptionDate = new Date(); // Current date and time

        System.out.println("Prescription has been written successfully.");
    }


    public void DisplayPrescription() {
        System.out.println("Doctor Appointed :" + Practitioner.getName() + "\n" + Practitioner.getID());
        System.out.println("Patient INFO");
        prescribedto.DisplayPatient();
        System.out.println("Doctor INFO ");

        System.out.println("Prescribed Medicines : \n" + medicines );
        System.out.println("Prescribed Date to patient :" + PrescriptionDate);
        
    }

    public void newPrescription(Doctor d,Patient p) {
        Scanner input = new Scanner(System.in);

        // Set Doctor
        Practitioner = d;

        // Set Patient
        prescribedto = p;

        // Set Medicines
        System.out.println("Enter Prescribed Medicines:");
        input.nextLine(); // consume the newline character
        medicines = input.nextLine();

        // Set Prescription Date
        PrescriptionDate = new Date(); // Current date and time

        System.out.println("Prescription has been written successfully.");
    }
}