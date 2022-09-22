package Emberek;

import java.time.LocalDateTime;
import java.util.Date;

public class Ember {

    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum , String szulHely){
        this.nev=nev;
        this.szulDatum=szulDatum;
        this.szulHely=szulHely;
    }


    public int SzulEv(){
        return Integer.parseInt(szulDatum.substring(0,4));
    }

    public int SzulHo(){
        return Integer.parseInt(szulDatum.substring(5,7));
    }

    public int SzulNap(){
      return Integer.parseInt(szulDatum.substring(8,10));
    }


    public int Kor(){
      return LocalDateTime.now().getYear()-this.SzulEv();
    }


    @Override
    public String toString() {return String.format("%30s  %10s %-20s ",this.nev,this.szulDatum,this.szulHely);}

}
