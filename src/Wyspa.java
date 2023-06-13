package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Wyspa {
    private static ArrayList<Druzyna> listaDruzyn = new ArrayList<>();
    private int iloscDruzyn = 0;
    public void dodajDruzyne(Druzyna a){
        listaDruzyn.add(a);
        iloscDruzyn += 1;
    }
    public Druzyna getDruzyna(int a){
        return listaDruzyn.get(a);
    }
    public int getIlosc(){
        return iloscDruzyn;
    }
    public void wyswietlDruzyny(){
        for (int i=0; i<iloscDruzyn; i++){
            listaDruzyn.get(i).toString();
        }
    }
    public Wyspa(){
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj nazwę swojej drużyny:");
        String nazwa = x.next();
        Druzyna nasza = new Druzyna(nazwa);
        dodajDruzyne(nasza);
        Sklep sklep = new Sklep();
        int a;
        for(int i=1; i<=12; i++){
            if(nasza.getSaldo()>=50) {
                System.out.println("Aktualni zawodnicy:");
                nasza.wyswietlZawodnikow();
                System.out.println("Wybierz zawodników do drużyny (Wybrano " + (i - 1) + "/12):");
                sklep.wyswietl();
                System.out.println("Twoje saldo: " + nasza.getSaldo());
                a = x.nextInt() - 1;
                nasza.dodajZawodnika(sklep.getZawodnik(a));
                nasza.wyplac(sklep.getZawodnik(a).getCena());
                sklep.kupiony(a);
            }
            else {
                System.out.println("Brak pieniędzy, dobieranie zawodników zakończone");
            }
        }
        String imie1, nazwa1;
        Random xx = new Random();
        int sila, refleks, szybkosc, celnosc, wzrost, waga;
        for(int i=1; i<8; i++){
            nazwa1 = BazaNazwDruzyn. wybierz(xx.nextInt(1, 21));
            Druzyna nowa = new Druzyna(nazwa1);
            for (int j=0; j<6; j++){
                sila = xx.nextInt(50, 101);
                refleks = xx.nextInt(50, 101);
                szybkosc = xx.nextInt(50, 101);
                celnosc = xx.nextInt(50, 101);
                imie1 = BazaImion.wybierz(xx.nextInt(0, 21));
                wzrost = xx.nextInt(150, 250);
                waga = xx.nextInt(50, 121);
                Zawodnik aa = new Zawodnik(imie1, sila, refleks, szybkosc, celnosc, wzrost, waga);
                nowa.dodajZawodnika(aa);
                nowa.dodajDoRep(j);
            }
            iloscDruzyn ++;
        }
    }
}
