package Emberek;
import  Emberek.Ember;

public class Main {
    public static void main(String[] args) {
        Ember e1=new Ember("Alfonzo","1987-11-22","Miskolc");
        Ember e2=new Ember("Adam Jensen","1987-04-06","Detroit");
        Ember e3=new Ember("Példa Béla","2000-07-30","Szeged");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(e1.SzulEv());

        System.out.printf("%s, %s, %s",e1.SzulEv(),e2.SzulEv(),e3.SzulEv());
        System.out.println("\n"+e1.Kor());
    }
}
