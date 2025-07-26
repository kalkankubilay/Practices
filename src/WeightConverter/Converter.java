package WeightConverter;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Choose an operation: ");
        System.out.println("Press 1 to convert LBS to KG \n" +
                "Press 2 to convert KG to LBS");
        choice = scanner.nextInt();
        if (choice == 1){
            System.out.print("Enter your weight in LBS: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45;
            System.out.println("Your weight in KG's is: " + newWeight + " KG");
        }
        else if (choice == 2){
            System.out.print("Enter your weight in KG: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.45;
            System.out.println("Your weight in LBS's is: " + newWeight + "LBS");
        }
        else
            System.out.println("Wrong input..");
        scanner.close();
    }
}
