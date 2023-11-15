import java.util.Objects;
import java.util.Scanner;

public class Patient {
    private String name;
    private String ID;
    private int age;
    private String address;
    private String status;
    private Doctor DoctorIncharge;
    private Bed BedUsed;
    private MedicalRecord Record;
    private Billing Bill;
    private Prescription patientprescription;

    public void SetPatient() {
        // scanner variable for input
        Scanner input = new Scanner(System.in);

        // taking user input for item attributes
        System.out.println("Enter the name of the patient : ");
        this.name = input.nextLine();
        System.out.println("Enter the ID of the patient : ");
        input.nextLine();
        this.ID = input.nextLine();
        System.out.println("Enter the Address of the patient : ");
        this.address = input.nextLine();
        System.out.println("Enter the Doctor Incharge Name of the patient : ");
        this.DoctorIncharge = input.next();
        System.out.println("Enter the Status of the patient : ");
        //Married, unmarried.
        this.status = input.nextLine();
        System.out.println("Enter the age of the patient : ");
        //Married, unmarried.
        this.age = input.nextInt();
    }
    public void DisplayPatient() {

        // TODO: Write statements and format output for the method

        System.out.println(name);
        System.out.println(ID);
        System.out.println(status);
        System.out.println(DoctorIncharge);
        System.out.println(age);
        System.out.println(address);
    }
    public void updatePatient(String ID, String name, int age, String status, String address) {
            if (this.ID.equals(ID)) {
                this.name = name;
                this.age = age;
                this.status = status;
                this.address = address;
                System.out.println("Patient information updated for Patient ID: " + ID);
            } else {
                System.out.println("Patient ID not found.");
            }
    }

    public void addPatient(String name, int age, String ID, String address, String status) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.address = address;
        this.status = status;
        System.out.println("Patient information updated for Patient ID: " + ID);
    }

    public void UpdateBilling() {
    }
}
