import java.util.ArrayList;
/*
 * Remove Record variable and age Variable 
 * Change Admission Date and DischargeDate to String 
 * Make it so that user can view all previous prescriptions or Find Prescription by date
 * Make it so that patient can view latest prescription
 * Do all of this in one method viewPrescriptions 
 * fix addPrescription method 
 */
public class MedicalRecord {
    private String admissionDate;
    private String dischargeDate;
    private ArrayList<Prescription> prescriptions; // As Prescription is another class

    // Method to add a prescription to the medical record
    public void addPrescription(Prescription prescription) {
        if(!prescriptions.contains(prescription)){
            prescriptions.add(prescription);
            System.out.println("Prescription added"); //getter of details present in prescription class

        } else {
            System.out.println("Cannot add prescription. The patient is either discharged or not admitted.");
        }
    }
}