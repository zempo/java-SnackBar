package snackbarApp;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Customer max = new Customer("Max", 45.15);
        Customer jennifer = new Customer("Jennifer", 45.15);

        System.out.println(max.printCustomerInfo());
    }
}