package src;
import java.io.Serializable;
import java.util.ArrayList;

public class Druzyna implements Serializable {
    public ArrayList<Zawodnik> Zawodnicy;
    private ArrayList<Zawodnik> reprezentacja = new ArrayList<Zawodnik>();
    private ArrayList<Przedmiot> przedmioty = new ArrayList<Przedmiot>();
    private int iloscZawodnikow = 0;
    private int iloscRep = 0;
    private int iloscPrzedmiotow = 0;
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
     void dodajDoRep(int a){
        if (iloscRep<6){
            reprezentacja.add(Zawodnicy.get(a));
            Zawodnicy.remove(a);
            iloscRep ++;
            iloscZawodnikow--;
        }
    }
    void usunZRep(int a){
        if (a<6 && a>-1){
            Zawodnicy.add(reprezentacja.get(a));
            reprezentacja.remove(a);
            iloscZawodnikow++;
            iloscRep--;
        }
        else System.out.println("Błąd");
    }
    void dodajPrzedmiot(Przedmiot a){
        przedmioty.add(a);
        iloscPrzedmiotow +=1;
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
            System.out.println(i+1 + ". " + Zawodnicy.get(i).toString());
        }
    }
    public void wyswietlReprezentacje(){
        for (int i=0; i<iloscRep; i++){
            System.out.println(i+1 + ". " + reprezentacja.get(i).toString());
        }
    }
    public void wyswietlPrzedmioty(){
        for (int i=0; i<iloscPrzedmiotow; i++){
            System.out.println(i+1 + ". " + przedmioty.get(i).toString());
        }
    }
    public Przedmiot getPrzedmiot(int a){
        return przedmioty.get(a);
    }
    public int getPunkty(){
        return punkty;
    }
    public int getSaldo(){
        return saldo;
    }
    public int getIloscZawodnikow(){
        return iloscZawodnikow;
    }
    public int getIloscRep(){
        return iloscRep;
    }
    public int getIloscPrzedmiotow(){
        return iloscPrzedmiotow;
    }
    public String toString(){
        return "Druzyna: " + nazwaDruzyny + " ilość punktów: " + punkty;
    }
}
