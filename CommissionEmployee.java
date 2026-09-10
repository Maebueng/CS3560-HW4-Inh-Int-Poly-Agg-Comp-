public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    // no arguments
    public CommissionEmployee() {
        super();
        this.commissionRate = 0;
        this.grossSales = 0;
    }

    // parametized
    public CommissionEmployee(String firstName, String lastName, String socialSecurity,
        double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // getters
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    // setters
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override 
    public String toString() {
        // super.toString to grab already written variables from superclass
        return super.toString() + " | Commission Rate: " + commissionRate + " | Gross Sales: $" + grossSales;
    }
    
}