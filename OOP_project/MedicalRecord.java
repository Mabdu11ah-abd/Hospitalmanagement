import java.util.ArrayList;
import java.util.Date;

public class MedicalRecord {
    private int age;
    private Date admissionDate;
    private Date dischargeDate;
    private String record;
    private ArrayList<Prescription> prescriptions; // As Prescription is another class

    // Getters and Setters for all fields
    public int getAge() {
        return age;
    }

    public MedicalRecord() {
    }

    public MedicalRecord(int age, Date admissionDate, Date dischargeDate) {
        setAge(age);
        setAdmissionDate(admissionDate);
        setDischargeDate(dischargeDate);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    // Method to update the patient's record
    public void updateRecord(String newRecord) {
        if (admissionDate != null && dischargeDate == null) {
            // Only allow updating record if the patient is currently admitted
            this.record = newRecord;
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
    //Method to get data of all prescription of the patient.
    public ArrayList<Prescription> getPrescriptions() {
        if (prescriptions != null) {
            return new ArrayList<>(prescriptions);
        } else {
            System.out.println("No prescriptions available.");
            return new ArrayList<>(); // Return an empty list if no prescriptions are present
        }
    }
}