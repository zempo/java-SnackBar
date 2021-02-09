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

    // SETTERS

    // METHODS
}