import java.util.Scanner; // allows for user input

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Vending Machine Simulator");

        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
// prompt user
            System.out.println("Enter bill value (1, 5, 10): ");
            int billValue = in.nextInt();
            System.out.println("Enter item price (in pennies): ");
            int itemPrice = in.nextInt();
// Calculate change
        int change = PENNIES_PER_DOLLAR * billValue -itemPrice;
        int dollars = change /PENNIES_PER_DOLLAR;
        change = change % PENNIES_PER_DOLLAR;
        int quarters = change / PENNIES_PER_QUARTER;

        // price change
        System.out.printf("Dollars: %d", dollars );
        System.out.println();
        System.out.printf("Quarters: %d ", quarters);
    }
}