package printf;

public class printf {
    public static void main(String[] args) {

        String name = "Kubilay";
        char firstLetter = 'K';
        int age = 26;
        double height = 178;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your first letter is %c \n",firstLetter);

        System.out.printf("%s is %d years old.", name, age);



    }
}
