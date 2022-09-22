package Emberek;

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
        int szulEv=Integer.parseInt(szulDatum.substring(0,4));
        return  szulEv;
    }

    public int SzulHo(){
        int szulHo=Integer.parseInt(szulDatum.substring(5,7));
        return  szulHo;
    }

    public int SzulNap(){
        int szulNap=Integer.parseInt(szulDatum.substring(8,10));
        return  szulNap;
    }



    @Override
    public String toString() {return String.format("%30s  %10s %-20s ",this.nev,this.szulDatum,this.szulHely);}

}
