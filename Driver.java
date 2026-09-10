public class Driver {
    public static void main(String[] args) {
        // Question 1
        // Stores employees in array for later access
        /*Employee[] employees = new Employee[7];

        *employees[0] = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        *employees[1] = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        *employees[2] = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        *employees[3] = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        *employees[4] = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        *employees[5] = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        *employees[6] = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
            */

        // Question 2
        Payable[] payables = new Payable[4];

        payables[0] = new Freelancer("Johnny", "Silverhand", 20, 77);
        payables[1] = new Freelancer("Garcian", "Smith", 51, 7);
        payables[2] = new VendorInvoice("Random Play", "12345", 1000.00);
        payables[3] = new VendorInvoice("Narumi Detective Office", "67890", 1500.00);

        double totalPayout = 0;

        for (int i = 0; i < payables.length; i++) {
            // prints name and amount due
            System.out.println(payables[i]);
            System.out.println("Payee: " + payables[i].getPayeeName() + " | Payment due: $" + payables[i].calculatePayment());
            totalPayout += payables[i].calculatePayment();
        }

        System.out.println("Total Payout: $" + totalPayout);
    }
}