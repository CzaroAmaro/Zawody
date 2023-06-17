package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Wyspa {
    private static ArrayList<Druzyna> listaDruzyn = new ArrayList<Druzyna>();
    private int iloscDruzyn = 0;
    private Druzyna naszaDruzyna;
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
            System.out.println(i+1 + ". " + listaDruzyn.get(i).toString());
        }
    }
    public Wyspa(){
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj nazwę swojej drużyny:");
        String nazwa = x.next();
        Druzyna nasza = new Druzyna(nazwa);
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
                if (a>=0 && a< sklep.getIloscZ()) {
                    nasza.dodajZawodnika(sklep.getZawodnik(a));
                    nasza.wyplac(sklep.getZawodnik(a).getCena());
                    sklep.kupiony(a);
                }
                else {
                    System.out.println("Nie ma takiego zawodnika! Wybierz jeszcze raz");
                    i--;
                }

            }
            else {
                System.out.println("Brak pieniędzy, dobieranie zawodników zakończone");
            }

        }
        System.out.println("Czy chcesz zarządzać sędziami ? " + "\n" + "Tak/Nie");
        String wybor = x.next();
        if (wybor.equals("Tak") || wybor.equals("tak")){
            boolean zakoncz = false;
            while (!zakoncz){
                System.out.println("Wybierz operacje:");
                System.out.println("1. Dodaj sedziego");
                System.out.println("2. Usun sedziego");
                System.out.println("3. Wyswietl sedziow");
                System.out.println("0. Zakoncz");

                int operacja = x.nextInt();
                x.nextLine();

                switch (operacja){
                    case 1:
                        System.out.printf("Podaj nazwisko sedziego: ");
                        String nazwisko = x.nextLine();
                        Sedzia.dodajSedziego(nazwisko);
                        break;
                    case 2:
                        System.out.println("Podaj index sedziego do usunięcia:");
                        int nazwiskoUsun = x.nextInt();
                        Sedzia.usunSedziego(nazwiskoUsun);
                        break;
                    case 3:
                        System.out.println("Lista sędziów:");
                        Sedzia.wyswietlSedziow();
                        break;
                    case 4:
                        zakoncz = true;
                        break;
                    default:
                        System.out.println("Niepoprawna operacja");
                }
            }
        }



        naszaDruzyna = nasza;
        ZarzadzanieDruzyna zarzadz = new ZarzadzanieDruzyna();
        zarzadz.interfejs(nasza);
        dodajDruzyne(nasza);

        String imie1, nazwa1;
        Random xx = new Random();
        int sila, refleks, szybkosc, celnosc, wzrost, waga;
        for(int i=1; i<8; i++){
            nazwa1 = BazaNazwDruzyn.wybierz(xx.nextInt(1, 21));
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
                nowa.dodajDoRep(0);
            }
            dodajDruzyne(nowa);
        }
    }
    public Grupy  stworzGrupe() {
        Grupy grupy = new Grupy(listaDruzyn.get(0),listaDruzyn.get(1),listaDruzyn.get(2),listaDruzyn.get(3));
        listaDruzyn.remove(0);
        listaDruzyn.remove(0);
        listaDruzyn.remove(0);
        listaDruzyn.remove(0);
        return  grupy;
    }

    public  void zarzadzajDruzynaa() {
        ZarzadzanieDruzyna zarzadz = new ZarzadzanieDruzyna();
        zarzadz.interfejs(naszaDruzyna);
    }
    public void wyswietlGrupy(Grupy grupaA, Grupy grupaB, Wyspa wyspa) {
        System.out.println("Grupa A");
        grupaA.wyswietlGrupe();

        System.out.println("Grupa B");
        grupaB.wyswietlGrupe();
        wyspa.zarzadzajDruzynaa();
    }
}
