public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    // no arguments
    public HourlyEmployee {
        super();
        wage = 0;
        hoursWorked = 0;
    }

    // parametized
    public HourlyEmployee(String firstName, String lastName, String socialSecurity, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // getters
    public double getWage() {
        return wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // setters
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    
}