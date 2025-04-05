
public class Name {
	String firstName;
    String lastName;
    
    public Name() {
    	
    }
    
    public Name(String firstName, String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setFirstName(String fname)
    {
        firstName = fname;
    }
    
    public void setLastName(String lname)
    {
        lastName = lname;
    }
    
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    
}
