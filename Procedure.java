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

public class Procedure 
{
    // Fields
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    //Default Constructor
    public Procedure(String pN, String pD, String prN, double prC) {
        procedureName = pN;
        procedureDate = pD;
        practitionerName = prN;
        procedureCharges = prC;
    }

    //Accessor methods
    public String getProcedureName() 
    {
        return procedureName;
    }

    public String getProcedureDate() 
    {
        return procedureDate;
    }

    public String getPractitionerName() 
    {
        return practitionerName;
    }

    public double getProcedureCharges() 
    {
        return procedureCharges;
    }

    //Mutator methods
    public void setProcedureName(String procedureName) 
    {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) 
    {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) 
    {
        this.practitionerName = practitionerName;
    }

    public void setProcedureCharges(double procedureCharges) 
    {
        this.procedureCharges = procedureCharges;
    }
}
