public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // no arguments
    public SalariedEmployee() {
        super(); // Calls Employee() constructor
        this.weeklySalary = 0.0;
    }

    // Parameterized Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber); // Handled by parent Employee class
        this.weeklySalary = weeklySalary;                 // Handled by SalariedEmployee
    }

    // Getters
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Setters
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override 
    public String toString() {
        // super.toString to grab already written variables from superclass
        return super.toString() + " | Weekly Salary: $" + weeklySalary;
    }

}