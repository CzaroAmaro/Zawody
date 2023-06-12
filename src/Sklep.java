package src;

import java.util.Random;
import java.util.ArrayList;
public class Sklep {
    private static final ArrayList<Zawodnik> zawodnicydowyboru = new ArrayList<Zawodnik>();
    private static int ilosc = 0;
    public Sklep(){
        Random x = new Random();
        String imie;
        int sila, refleks, celnosc, szybkosc, waga, losujImie, wzrost;
        for (int i=0; i<40; i++){
            sila = x.nextInt(50, 101);
            refleks = x.nextInt(50, 101);
            szybkosc = x.nextInt(50, 101);
            celnosc = x.nextInt(50, 101);
            wzrost = x.nextInt(150, 250);
            waga = x.nextInt(50, 121);
            imie = BazaImion.wybierz(x.nextInt(0, 21));
            Zawodnik a = new Zawodnik(imie, sila, refleks, szybkosc, celnosc, wzrost, waga);
            zawodnicydowyboru.add(a);
        }
    }
    public static void dodajZawodnika(Zawodnik a){
        zawodnicydowyboru.add(a);
        ilosc += 1;
    }
    public static Zawodnik getZawodnik(int a){
        if(a>-1 && a<ilosc) {
            return zawodnicydowyboru.get(a);
        }
        else return zawodnicydowyboru.get(1);
    }
    public void kupiony(int a){
        if (a>-1 && a<ilosc) {
            zawodnicydowyboru.remove(a);
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
            System.out.println(i+1 + ". " + zawodnicydowyboru.get(i).toString());
        }
    }
}
