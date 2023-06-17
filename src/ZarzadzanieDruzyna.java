package src;
import java.util.Scanner;

public class ZarzadzanieDruzyna {
    public void interfejs(Druzyna druzyna){
        int wybor;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Zarządzanie drużyną");
            System.out.println("Co chcesz zrobić?");
            System.out.println("0. Wyjdź");
            System.out.println("1. Wyświetl zawodników z drużyny");
            System.out.println("2. Edytuj reprezentację drużyny");
            System.out.println("3. Kup przedmioty ze sklepu");
            wybor = scanner.nextInt();
            if (wybor == 1){
                zawodnicy(druzyna);
            }
            if (wybor == 2){
                reprezentacja(druzyna);
            }
            if (wybor == 3){
                kupPrzedmioty(druzyna);
            }
        }while (wybor != 0);
    }
    public void zawodnicy(Druzyna druzyna){
        int b=0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Zawodnicy:");
            druzyna.wyswietlZawodnikow();
            System.out.println();
            System.out.println("Pokaż szczególy zawodnika");
            System.out.println("Wciśnij 0 aby wyjść");
            b = x.nextInt();
            if (b>0 && b <= druzyna.getIloscZawodnikow()) {
                druzyna.getZawodnik(b - 1).showStaty();
            }
            else System.out.println("Nie ma takiego zawodnika");
        }while(b!=0);
    }
    public void reprezentacja(Druzyna druzyna){
        int c=0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Reprezentacja:");
            druzyna.wyswietlReprezentacje();
            System.out.println();
            System.out.println("0. Wyjdź");
            System.out.println("1. Pokaż szczególy zawodnika");
            System.out.println("2. Dodaj zawodnika do reprezentacji");
            System.out.println("3. Usuń zawdonika z reprezentacji");
            System.out.println("4. Użyj przedmiotu na zawodniku");
            c = x.nextInt();
            if (c==1){
                if (c==1){
                System.out.println("Który zawodnik?");
                int b = x.nextInt();
                if (b>0 && b<=druzyna.getIloscRep()) {
                    druzyna.getRep(b - 1).showStaty();
                }
                else System.out.println("NIe ma takiego zawodnika");
            }
            if (c==2){
                System.out.println("Którego zawodnika chcesz dodać?");
                druzyna.wyswietlZawodnikow();
                int b = x.nextInt();
                if (b>0 && b <= druzyna.getIloscZawodnikow()) {
                    druzyna.dodajDoRep(b - 1);
                }
                else System.out.println("NIe ma takiego zawodnika");
            }
            if (c==3){
                System.out.println("Którego zawodnika chcesz usunąć?");
                int b = x.nextInt();
                if (b>0 && b <= druzyna.getIloscRep()) {
                    druzyna.usunZRep(b - 1);
                }
                else System.out.println("Nie ma takiego zawodnika");
            }
            if (c==4){
                System.out.println("Na którym zawodniku chcesz użyć przedmiotu?");
                int bb = x.nextInt();
                System.out.println("Jakiego przedmiotu chcesz użyć?");
                druzyna.wyswietlPrzedmioty();
                int cc = x.nextInt();
                if (bb <= druzyna.getIloscRep() && cc <= druzyna.getIloscPrzedmiotow() && bb >= 0 && cc >= 0) {
                   // druzyna.getPrzedmiot(cc-1).uzyj(druzyna.getRep(bb-1));
                    druzyna.usunPrzedmiot(cc-1);
                }
                else System.out.println("Błąd");
            }
        }while(c!=0);
    }
    public void kupPrzedmioty(Druzyna druzyna){
        Scanner x = new Scanner(System.in);
        Piwo piwo = new Piwo();
        Izotonik izotonik = new Izotonik();
        Karnetnasilke karnet = new Karnetnasilke();
        Wzrostanol wzrostanol = new Wzrostanol();
        Steryd steryd = new Steryd();
        LeweDokumenty leweDokumenty = new LeweDokumenty();
        int d=0;
        do {
            System.out.println("Saldo: " + druzyna.getSaldo());
            System.out.println();
            System.out.println("Twoje przedmioty:");
            druzyna.wyswietlPrzedmioty();
            System.out.println();
            System.out.println("Lista pzredmiotów do kupienia:");
            System.out.println("1. Piwo cena: " + piwo.getCena());
            piwo.opis();
            System.out.println();
            System.out.println("2. Napój izotoniczny cena: " + izotonik.getCena());
            izotonik.opis();
            System.out.println();
            System.out.println("3. Karnet na siłownie cena: " + karnet.getCena());
            karnet.opis();
            System.out.println();
            System.out.println("4. Wzrostanol cena: " + wzrostanol.getCena());
            wzrostanol.opis();
            System.out.println();
            System.out.println("5. Steryd cena: " + steryd.getCena());
            steryd.opis();
            System.out.println();
            System.out.println("6. Lewe dokumenty cena: " + leweDokumenty.getCena());
            leweDokumenty.opis();
            System.out.println();
            System.out.println("0. Wyjdź");
            d = x.nextInt();
            if (d == 1){
                if(druzyna.getSaldo() >= piwo.getCena()) {
                    druzyna.dodajPrzedmiot(piwo);
                    druzyna.wyplac(piwo.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (d == 2){
                if(druzyna.getSaldo() >= izotonik.getCena()) {
                    druzyna.dodajPrzedmiot(izotonik);
                    druzyna.wyplac(izotonik.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (d == 3){
                if(druzyna.getSaldo() >= karnet.getCena()) {
                    druzyna.dodajPrzedmiot(karnet);
                    druzyna.wyplac(karnet.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (d == 4){
                if(druzyna.getSaldo() >= wzrostanol.getCena()) {
                    druzyna.dodajPrzedmiot(wzrostanol);
                    druzyna.wyplac(wzrostanol.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (d == 5){
                if(druzyna.getSaldo() >= steryd.getCena()) {
                    druzyna.dodajPrzedmiot(steryd);
                    druzyna.wyplac(steryd.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (d == 6){
                if(druzyna.getSaldo() >= leweDokumenty.getCena()) {
                    druzyna.dodajPrzedmiot(leweDokumenty);
                    druzyna.wyplac(leweDokumenty.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (d != 0 && d != 1 && d != 2 && d != 4 && d != 5 && d != 6){
                System.out.println("Nie ma takiego przedmiotu");
            }
        }while(d!=0);
    }
}
