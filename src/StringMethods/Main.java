package StringMethods;

public class Main {
    public static void main(String[] args) {

        String name = "Kubilay KALKAN";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");//boşluk kaçıncı indexte
        int lastIndex = name.lastIndexOf("A");//son A kaçıncı indexte

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();//öndeki ve sondaki boşlukları temizler
        //name = name.replace("A","e");//A ları e ile değiştirir

        if (name.contains(" ")){
            System.out.println("Your name contains space");
        }
        else {
            System.out.println("Your name doesn't contain any spaces");
        }

        if (name.equalsIgnoreCase("kubilay kalkan")){//IgnoreCase yapınca büyük küçük harf farketmiyor.
            System.out.println("Your name can't be password");
        }

    }
}
