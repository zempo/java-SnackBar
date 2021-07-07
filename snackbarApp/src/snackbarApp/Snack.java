package snackbarApp;

/**
 * Snack
 */
public class Snack {
    private static int maxId = 0;

    public int id;
    public String name;
    public int quantity;
    public double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }
    
    // GETTERS
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getCost() {
        return cost;
    }
    
    public int getVendingMachineId() {
        return vendingMachineId;
    }
    
    // SETTERS
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setCost(double newCost) {
        this.cost = newCost;
    }
    
    public void setVendingMachineId(int newId) {
        this.vendingMachineId = newId;
    }
    
    // METHODS
    public String printSnackInfo() {
        return "Snack "
         + getId()
         + " Info:"
         + "\nName: "
         + getName()
         + "\nCost: "
         + getCost()
         + "\nQuantity: "
         + getQuantity();
    }

    public void setQuantity(int amtToAdd) {
        this.quantity += amtToAdd;
    }

    public double buySnacks(double amtToBuy) {
        this.quantity -= (int)amtToBuy;
        return amtToBuy * cost;
    }

    public double previewCost(double previewAmount) {
        return previewAmount * cost;
    } 
}