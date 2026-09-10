public interface Payable {
    
    // returns amount to be paid this period
    public double calculatePayment();

    // returns name of the person/entity being paid
    public String getPayeeName();
}