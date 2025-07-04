package Test;

import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Hypotenuse Exercise

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));
        // c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hypotenuse is: " + c);
        */

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius ,3);

        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        System.out.println("Circumference is: " + circumference + " cm ");
        area = Math.PI * Math.pow(radius , 2);
        System.out.println("Area is: " + area + " cm² ");
        volume =(4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.println("Volume is: " + volume + " cm³ ");

        System.out.println(" ");
        System.out.printf("Circumference is: %.1fcm\n", circumference);
        System.out.printf("Area is: %.1fcm²\n",area);
        System.out.printf("Volume is: %.1fcm³\n",volume);



        scanner.close();

    }
}
