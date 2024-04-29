
public class Account {
    private int id;
    private Customer cus;
    private double bal;

    public Account(int id, Customer cus, double bal) {
        this.id = id;
        this.cus = cus;
        this.bal = bal;
    }
    
    public boolean deposit(double amount){
        bal += amount;
        return true;
    }
    
    public boolean withdraw(double amount){
        if(bal >= amount){
            bal -= amount;
            return true;
        }
        return false;
    }
    
    public String toString(){
        return cus.toString() + "Account ID : " + id + "\nBalance : "
                + String.format("%.2f", bal) + " $\n";
    }
}
