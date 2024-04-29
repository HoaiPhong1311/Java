
public class Invoice {
    private String id;
    private Customer cus;
    private double amount;

    public Invoice(String id, Customer cus, double amount) {
        this.id = id;
        this.cus = cus;
        this.amount = amount;
    }
    
    public double getAmount(){
        return amount * (1.00 - (double)cus.getDis() / 100);
    }
    
    public String toString(){
        return "Customer ID : " + cus.getId() 
                + "\nFull Name : " + cus.getName()
                + "\nAmount : " + String.format("%.2f", getAmount())
                + " $\n--------------------";
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }
}
