public class Employee {
    // Fields
    private String firstName;
    private String lastName;
    private String socialSecurity;

    // No arguments passed
    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.socialSecurity = "123-45-7890";
    }
    
    // Default Constructor
    public Employee(String firstName, String lastName, String socialSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    } 

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }


}

