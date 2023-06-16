package src;
import java.io.Serializable;
import java.util.ArrayList;

public class Sedzia implements Serializable{
    public ArrayList <Sedzia> Sedziowie;
    private String nazwisko;
    private int skutecznosc;
    private int przychylnosc1;
    private int przychylnsoc2;
    public Sedzia (String nazwisko, int przychylnosc1, int przychylnsoc2, int skutecznosc){
        this.nazwisko = nazwisko;
        this.przychylnosc1 = przychylnosc1;
        this.przychylnsoc2 = przychylnsoc2;
        this.skutecznosc = skutecznosc;
    }

    public int Dodajsedziego(){
        System.out.println("Którego sędziego chcesz wybrać do meczu");
        System.out.println("1.Sedzia Jarosz" + "\n" + "2.Sedzia Godlewski" + "\n" + "3.Sedzia Tarczyn");


    }
    public void setPrzychylnosc1(int przychylnosc1){
        this.przychylnosc1 = przychylnosc1;
    }
    public void setPrzychylnsoc2(int przychylnsoc2){
        this.przychylnsoc2 = przychylnsoc2;
    }
    public int getPrzychylnosc1(){
        return przychylnosc1;
    }
    public int getPrzychylnosc2(){
        return przychylnsoc2;
    }


}
