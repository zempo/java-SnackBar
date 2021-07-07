package snackbarApp;
/**
 * Customer
 */
public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    public double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // GETTERS
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCashOnHand() {
        return cashOnHand;
    }
    
    // SETTERS
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setCashOnHand(double newBalance) {
        this.cashOnHand = newBalance;
    }
    
    // SPECIAL METHODS
    public String printCustomerInfo() {
        return "Customer " + getId() + " Info:" + "\nName: " + getName() + "\nCash on Hand: " + getCashOnHand();
    }

    public void addCash(double cashToAdd) {
        this.cashOnHand += cashToAdd;
    }

    public double buySnacks(double customerBalance) {
        setCashOnHand(this.cashOnHand - customerBalance);
        return cashOnHand;
    }
}