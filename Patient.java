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

public class Patient 
{
	    // Fields
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private String address;
	    private String city;
	    private String state;
	    private String zipCode;
	    private String phoneNumber;
	    private String emergencyContactName;
	    private String emergencyContactPhoneNumber;

	    //Default constructor
	    public Patient(String f, String m, String l, String a, String c, 
	    		String s, String z, String p, String eN, String eP) 
	    {
	        firstName = f;
	        middleName = m;
	        lastName = l;
	        address = a;
	        city = c;
	        state = s;
	        zipCode = z;
	        phoneNumber = p;
	        emergencyContactName = eN;
	        emergencyContactPhoneNumber = eP;
	    }

	    //Accessor methods
	    public String getFirstName() 
	    {
	        return firstName;
	    }

	    public String getMiddleName() 
	    {
	        return middleName;
	    }

	    public String getLastName() 
	    {
	        return lastName;
	    }

	    public String getAddress() 
	    {
	        return address;
	    }

	    public String getCity() 
	    {
	        return city;
	    }

	    public String getState() 
	    {
	        return state;
	    }

	    public String getZipCode() 
	    {
	        return zipCode;
	    }

	    public String getPhoneNumber() 
	    {
	        return phoneNumber;
	    }

	    public String getEmergencyContactName() 
	    {
	        return emergencyContactName;
	    }

	    public String getEmergencyContactPhoneNumber() 
	    {
	        return emergencyContactPhoneNumber;
	    }

	    //Mutator methods
	    public void setFirstName(String firstName) 
	    {
	        this.firstName = firstName;
	    }

	    public void setMiddleName(String middleName) 
	    {
	        this.middleName = middleName;
	    }

	    public void setLastName(String lastName) 
	    {
	        this.lastName = lastName;
	    }

	    public void setAddress(String address) 
	    {
	        this.address = address;
	    }

	    public void setCity(String city) 
	    {
	        this.city = city;
	    }

	    public void setState(String state) 
	    {
	        this.state = state;
	    }

	    public void setZipCode(String zipCode) 
	    {
	        this.zipCode = zipCode;
	    }

	    public void setPhoneNumber(String phoneNumber) 
	    {
	        this.phoneNumber = phoneNumber;
	    }

	    public void setEmergencyContactName(String emergencyContactName) 
	    {
	        this.emergencyContactName = emergencyContactName;
	    }

	    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) 
	    {
	        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	    }
	    
	}