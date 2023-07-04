/*
 Class: CMSC203 CRN 40398
 Program: Assignment # 2
 Instructor: Farnaz Eivazi
 Summary of Description: Patient Portal 
 Due Date: 07/03/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Shawn Parmhans
 */

public class PatientDriverApp 
{
    public static void main(String[] args) {
        // Create a Patient object
        Patient patient = new Patient("Emma", "Grace", "Thompson",
                "567 Pine Street", "New York", "NY", "10001",
                "555-444-7777", "John Thompson", "555-666-8888");

        // Get date for today
        String date = "07/03/2023";

        // Create three Procedure objects
        Procedure procedure1 = new Procedure("Colonoscopy", date, "Dr. Hernandez", 1000.00);
        Procedure procedure2 = new Procedure("Ultrasound", date, "Dr. Patel", 300.00);
        Procedure procedure3 = new Procedure("Dental Extraction", date, "Dr. Roberts", 400.00);

        // Display patient information
        System.out.println("Name: " + patient.getFirstName() + " " + patient.getMiddleName() + " " + patient.getLastName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("City: " + patient.getCity());
        System.out.println("State: " + patient.getState());
        System.out.println("ZIP: " + patient.getZipCode());
        System.out.println("Phone Number: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.getEmergencyContactName() + " - " + patient.getEmergencyContactPhoneNumber());

        // Display procedure information
        System.out.println("Procedure:");
        System.out.println("Procedure name: " + procedure1.getProcedureName());
        System.out.println("Date: " + procedure1.getProcedureDate());
        System.out.println("Practitioner: " + procedure1.getPractitionerName());
        System.out.println("Procedure Charge: $" + procedure1.getProcedureCharges());

        System.out.println("\nProcedure:");
        System.out.println("Procedure name: " + procedure2.getProcedureName());
        System.out.println("Procedure Date: " + procedure2.getProcedureDate());
        System.out.println("Practitioner: " + procedure2.getPractitionerName());
        System.out.println("Procedure Charge: $" + procedure2.getProcedureCharges());

        System.out.println("\nProcedure:");
        System.out.println("Procedure name: " + procedure3.getProcedureName());
        System.out.println("Procedure Date: " + procedure3.getProcedureDate());
        System.out.println("Practitioner: " + procedure3.getPractitionerName());
        System.out.println("Procedure Charge: $" + procedure3.getProcedureCharges());

        // Display total charges
        double totalCharges = procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
        System.out.println("\nTotal Charges: $" + totalCharges);

        // Display program info
        System.out.println("\nStudent name: Shawn Parmhans");
        System.out.println("Student MC M#: M21073674");
        System.out.println("Due Date: 07/03/23");
    }
}
