package src;

import java.io.Serializable;
import java.util.ArrayList;
public class Druzyna implements Serializable {
    public ArrayList<Zawodnik> Zawodnicy;
    private ArrayList<Zawodnik> reprezentacja = new ArrayList<Zawodnik>();
    private int iloscZawodnikow = 0;
    private int iloscRep = 0;
    private int punkty = 0;
    private int saldo = 2000;
    public int druzynaID;
    public static int currentID = 1;
    public int IloscZwyciestw = 0;
    public String nazwaDruzyny;

    public Druzyna(){
        Zawodnicy = new ArrayList<Zawodnik>();
    }

    public Druzyna(String nazwa, int iloscZwyciestw){
        nazwaDruzyny = nazwa;
        druzynaID = currentID;
        this.IloscZwyciestw = iloscZwyciestw;
        currentID += 1;
        Zawodnicy = new ArrayList<Zawodnik>();
    }

    public Druzyna(String nazwa){
        nazwaDruzyny = nazwa;
        druzynaID = currentID;
        this.IloscZwyciestw = 0;
        currentID += 1;
        Zawodnicy = new ArrayList<Zawodnik>();
    }
    public void dodajpunkty(int a){
        punkty += a;
    }
    public void dodajZawodnika(Zawodnik a){
        if (iloscZawodnikow < 10){
            Zawodnicy.add(a);
            iloscZawodnikow += 1;
            System.out.println("Dodawno zawodnika pomyślnie\n");
        }
        else System.out.println("Drużyna ma maksymalną ilość zawodników");
    }
    void dodajDoRep(int a){
        if (a<6){
            if (Zawodnicy.get(a).getZmeczenie() > 20) {
                reprezentacja.add(Zawodnicy.get(a));
            }
        }
    }
    void usunZRep(int a){
        if (a<6 && a>-1){
            reprezentacja.remove(a);
        }
        else System.out.println("Błąd");
    }
    public Zawodnik getZawodnik(int a){
        return Zawodnicy.get(a);
    }
    public Zawodnik getRep(int a){
        return reprezentacja.get(a);
    }
    public void wplac(int a){
        saldo += a;
    }
    public void wyplac(int a){
        if (saldo > a) {
            saldo -= a;
        }
        else System.out.println("Za mało pieniędzy na koncie!");
    }
    public void wyswietlZawodnikow(){
        for (int i=0; i<iloscZawodnikow; i++){
            Zawodnicy.get(i).toString();
        }
    }
    public void wyswietlReprezentacje(){
        for (int i=0; i<iloscRep; i++){
            reprezentacja.get(i).toString();
        }
    }
    public int getPunkty(){
        return punkty;
    }
    public String toString(){
        return "Druzyna: " + nazwaDruzyny + " ilość punktów: " + punkty;
    }
}
