package snackbarApp;

/**
 * VendingMachine
 */
public class VendingMachine {
    private static int maxId = 0;

    public int id;
    public String name;

    public VendingMachine(String name) {
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    // SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}