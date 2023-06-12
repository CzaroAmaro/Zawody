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
    public void StworzWlasnaDruzyne(){
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj nazwę swojej drużyny:");
        String nazwa = x.next();
        Druzyna nasza = new Druzyna(nazwa);
        dodajDruzyne(nasza);
        Sklep sklep = new Sklep();
        int a;
        for(int i=1; i<=12; i++){
            System.out.println("Wybierz zawodników do drużyny (Wybrano " + i + "/12):");
            sklep.wyswietl();
            System.out.println("Twoje saldo: " + nasza.getSaldo());
            a = x.nextInt()-1;
            nasza.dodajZawodnika(sklep.getZawodnik(a));
            sklep.kupiony(a);
        }
    }
    public void losowanieDruzyn(){
        String imie, nazwa;
        Random x = new Random();
        int sila, refleks, szybkosc, celnosc, wzrost, waga;
        for(int i=1; i<8; i++){
            nazwa = BazaNazwDruzyn. wybierz(x.nextInt(1, 21));
            Druzyna nowa = new Druzyna(nazwa);
            for (int j=0; j<6; j++){
                sila = x.nextInt(50, 101);
                refleks = x.nextInt(50, 101);
                szybkosc = x.nextInt(50, 101);
                celnosc = x.nextInt(50, 101);
                imie = BazaImion.wybierz(x.nextInt(0, 21));
                wzrost = x.nextInt(150, 250);
                waga = x.nextInt(50, 121);
                Zawodnik a = new Zawodnik(imie, sila, refleks, szybkosc, celnosc, wzrost, waga);
                nowa.dodajZawodnika(a);
                nowa.dodajDoRep(j);
            }
            iloscDruzyn ++;
        }
    }
}
