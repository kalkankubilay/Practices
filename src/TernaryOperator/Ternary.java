package TernaryOperator;

public class Ternary {
    public static void main(String[] args) {

        int score = 70;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        System.out.println(" ");

        int number = 6;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        System.out.println(" ");

        int hours = 9;
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println(timeOfDay);

        System.out.println(" ");

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
 