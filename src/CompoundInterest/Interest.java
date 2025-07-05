package CompoundInterest;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialAmount;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the initial amount: ");
        initialAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the amount of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = initialAmount * Math.pow( 1 + rate/timesCompounded, timesCompounded*years);
        System.out.printf("The amount after %d years is ₺%.2f", years ,amount);

        scanner.close();






    }
}
