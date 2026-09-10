public class BaseEmployee extends Employee {
    private double baseSalary;

    // no arguments
    public BaseEmployee {
        super();
        this.baseSalary = 0;
    }

    // parametized
    public BaseEmployee(String firstName, String lastName, String socialSecurity, double baseSalary) {
        super(firstName, lastName, socialSecurity);
        this.baseSalary = baseSalary;
    }

    // getters
    public double getBaseSalary() {
        return baseSalary;
    }

    // setters
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}