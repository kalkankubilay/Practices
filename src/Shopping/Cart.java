package Shopping;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char currency = '$';
        System.out.print("Type what u wanted to buy: ");
        String product = scanner.nextLine();
        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the amount of the product: ");
        int amount = scanner.nextInt();

        double total = amount * price;
        System.out.println("Your total is: " + total + currency);

        scanner.close();
    }
}
