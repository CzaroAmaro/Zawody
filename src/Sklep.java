package src;

import java.util.Random;
import java.util.ArrayList;
public class Sklep {
    private static final ArrayList<Zawodnik> zawodnicydowyboru = new ArrayList<Zawodnik>();
    private static int ilosc = 0;
    public Sklep(){
        Random losowa = new Random();
        String imie;
        int sila, refleks, celnosc, szybkosc, waga, losujImie, wzrost;
        for (int i=0; i<40; i++){
            sila = losowa.nextInt(50, 101);
            refleks = losowa.nextInt(50, 101);
            szybkosc = losowa.nextInt(50, 101);
            celnosc = losowa.nextInt(50, 101);
            wzrost = losowa.nextInt(150, 250);
            waga = losowa.nextInt(50, 121);
            imie = BazaImion.wybierz(losowa.nextInt(0, 21));
            Zawodnik nowyZawodnik = new Zawodnik(imie, sila, refleks, szybkosc, celnosc, wzrost, waga);
            dodajZawodnika(nowyZawodnik);
        }
    }
    public static void dodajZawodnika(Zawodnik zawodnik){
        zawodnicydowyboru.add(zawodnik);
        ilosc += 1;
    }
    public static Zawodnik getZawodnik(int numerZawodnika){
        if(numerZawodnika>-1 && numerZawodnika<ilosc) {
            return zawodnicydowyboru.get(numerZawodnika);
        }
        else return zawodnicydowyboru.get(1);
    }
    public void kupiony(int numerZawodnika){
        if (numerZawodnika>-1 && numerZawodnika<ilosc) {
            zawodnicydowyboru.remove(numerZawodnika);
            ilosc -= 1;
        }
        else System.out.println("Błąd");
    }
    public int getIloscZ(){
        return ilosc;
    }
    public static void wyswietl(){
        System.out.println("Zawodnicy:");
        for (int i=0; i<ilosc; i++){
            System.out.println(i+1 + ". " + zawodnicydowyboru.get(i).toString() + " cena: " + zawodnicydowyboru.get(i).getCena());
        }
    }
}
