package snackbarApp;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob", 33.14);
        Customer jane = new Customer("Jane", 45.25);
        Customer jennifer = new Customer("Jennifer", 145.15);
        Customer max = new Customer("Max", 25.15);

        // special custom method
        System.out.println(max.printCustomerInfo() + "\n");

        VendingMachine cafeteria1 = new VendingMachine("Cafeteria Machine 1");
        VendingMachine cafeteria2 = new VendingMachine("Cafeteria Machine 2");
        VendingMachine lobby1 = new VendingMachine("Lobby Machine 1");
        VendingMachine officecommons1 = new VendingMachine("Office Commons 1");
        
        Snack chips1 = new Snack("Chips", 26, 1.75, 1);
        System.out.println(chips1.printSnackInfo() + "\nFrom: " + cafeteria1.getName() + "\n");
        Snack chocolateBar1 = new Snack("Chocolate Bar", 16, 1.00, 1);
        Snack pretzel1 = new Snack("Pretzel", 40, 2.00, 1);
        Snack chips2 = new Snack("Chips", 36, 1.75, 2);
        Snack chocolateBar2 = new Snack("Chocolate Bar", 36, 1.00, 2);
        System.out.println(chips2.printSnackInfo() + "\nFrom: " + cafeteria2.getName() + "\n");
        Snack pretzel2 = new Snack("Pretzel", 32, 2.00, 2);
        Snack chips3 = new Snack("Chips", 42, 1.75, 3);
        System.out.println(chips3.printSnackInfo() + "\nFrom: " + lobby1.getName() + "\n");
        Snack chocolateBar4 = new Snack("Chocolate Bar", 36, 1.00, 4);
        System.out.println(chocolateBar4.printSnackInfo() + "\nFrom: " + officecommons1.getName() + "\n");

        Snack soda1 = new Snack("Soda", 24, 2.50, 1);
        Snack water2 = new Snack("Water", 20, 2.75, 2);

        jane.buySnacks(soda1.buySnacks(3));
        System.out.println(jane.getCashOnHand());
        System.out.println(soda1.getQuantity());

    }
}