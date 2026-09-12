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
        /*Payable[] payables = new Payable[4];

        *payables[0] = new Freelancer("Johnny", "Silverhand", 20, 77);
        *payables[1] = new Freelancer("Garcian", "Smith", 51, 7);
        *payables[2] = new VendorInvoice("Random Play", "12345", 1000.00);
        *payables[3] = new VendorInvoice("Narumi Detective Office", "67890", 1500.00);

        *double totalPayout = 0;

        for (int i = 0; i < payables.length; i++) {
            // prints name and amount due
            System.out.println(payables[i]);
            System.out.println("Payee: " + payables[i].getPayeeName() + " | Payment due: $" + payables[i].calculatePayment());
            totalPayout += payables[i].calculatePayment();
        }

        System.out.println("Total Payout: $" + totalPayout);

        // Question 3
        /*Ship[] ships = new Ship[3];

        ships[0] = new Ship("Pequod", "1840");
        ships[1] = new CruiseShip("Titanic", "1912", 3547);
        ships[2] = new CargoShip("Generic Cargo Ship", "2001", 25);

        for (int i = 0; i < ships.length; i++) {
            System.out.println(ships[i]);
        }*/

        // Question 4
        /*Course[] courses = new Course[2];

        courses[0] = new Course("CS 3560",
                        new Instructor("Nima", "Davarpanah", "3-2636"),
                        new Textbook("Clean Code", "Robert C. Martin", "Addison-Wesley Professional"));
        courses[1] = new Course("Whale Hunting 101",
                        new Instructor("Captain", "Ahab", "10-1851"),
                        new Textbook("Moby Dick", "Herman Melville", "Richard Bentley"));
        
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }*/

        // Question 5

        // root folder
        Folder phpDemo1 = new Folder("php_demo1");

        // source file
        Folder sourceFiles = new Folder("Sources Files");

        // children of source file
            Folder phalcon = new Folder(".phalcon");
            Folder app = new Folder("app");
                Folder config = new Folder("config");
                Folder controllers = new Folder("controllers");
                Folder library = new Folder("library");
                Folder migrations = new Folder("migartions");
                Folder models = new Folder("models");
                Folder views = new Folder("views");

                app.addFolder(config);
                app.addFolder(controllers);
                app.addFolder(library);
                app.addFolder(migrations);
                app.addFoldeer(models);
                app.addFolder(views);

            Folder cache = new Folder("cache");
            Folder publicFolder = new Folder("public");
                File htAccess = new File(".htaccess");
                File htRouter = new File(".htrouter.php");
                File indexHtml = new File("index.html");

                publicFolder.addFile(htAccess);
                publicFolder.addFile(htRouter);
                publicFolder.addFile(indexHtml);

            sourceFiles.addFolder(phalcon);
            sourceFiles.addFolder(app);
            sourceFiles.addFolder(cache);
            sourceFiles.addFolder(publicFolder);
        
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addFolder(sourceFiles);
        phpDemo1.addFolder(includePath);
        phpDemo1.addFolder(remoteFiles);

        // 5.1 Print out all the folders and files
        phpDemo1.print();

        // 5.2 Delete folder 'app' and print out file structure
        phpDemo1.removeFolder("app");
        phpDemo1.print();

        // 5.3 Delte folder 'public' and print out file structure
        phpDemo1.removeFolder("public");
        phpDemo1.print();

    }
}