public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    // default
    public VendorInvoice() {
        this.vendorName = "Generic Vendor";
        this.invoiceNumber = "12345";
        setAmountDue(0);
    }

    // parametized
    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        // validates user input
        setAmountDue(amountDue);

    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override 
    public String getPayeeName() {
        return vendorName;
    }

    // getters
    public String getVendorName() {
        return vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    // setters
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            throw new IllegalArgumentException("Amount due must be positive");
        }
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        return "Vendor: " + vendorName + " | Invoice Number: " + invoiceNumber +
        " | Amount Due: $" + amountDue;
    }
}