public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    // default
    public Freelancer() {
        this.firstName = "John";
        this.lastName = "Doe";
        setHourlyRate(0);
        setHoursWorked(0);
    }

    // parametized
    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        // validates user input for negative values
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }
    
    @Override 
    public double calculatePayment() {
        if (hoursWorked > 40) {
            // first 40 hours standard, remaining hours at 1.5x
            double regularPay = 40 * hourlyRate;
            double overtimePay = (hoursWorked - 40) * (hourlyRate * 1.5);
            return regularPay + overtimePay;
        } else {
            return hourlyRate * hoursWorked;
        }
    }

    @Override 
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }


    // setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setHourlyRate(double hourlyRate) {
        // input validation
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate must be positive");
        }
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        // input validation
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked must be positive");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " | Hourly Rate: $" +
        hourlyRate + " | Hours Worked: " + hoursWorked;
    }
}