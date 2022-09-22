package Emberek;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Alfonzo", "1987-11-22", "Miskolc");
        Ember e2 = new Ember("Adam Jensen", "1987-04-06", "Detroit");
        Ember e3 = new Ember("Példa Béla", "2000-07-30", "Szeged");
        Ember e4 = new Ember("Simon", "1971-03-11", "Pécs");
        Ember e5 = new Ember("Kovács Katalin", "1930-01-01", "Debrecen");

        Ember[] emberTomb = new Ember[]{e1, e2, e3, e4, e5};
        Emberek ek= new Emberek(emberTomb);
        String fajlnev="emberek.txt";
        try {
            Emberek ek2=new Emberek(fajlnev);
            System.out.println(ek2);
        } catch (FileNotFoundException e) {
           System.out.printf("Anyád %s",fajlnev);
        } catch (IOException e) {
            System.out.println("Ismeretlen hiba");
        }

        System.out.println(ek);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(e1.SzulEv());

        System.out.printf("%s, %s, %s", e1.SzulEv(), e2.SzulEv(), e3.SzulEv());
        System.out.println("\n" + e1.Kor());
    }
}
