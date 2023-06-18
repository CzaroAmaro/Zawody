package src;
import java.util.Scanner;

public class ZarzadzanieDruzyna {
    public void interfejs(Druzyna druzyna){
        int opcja = 0;
        Scanner skaner = new Scanner(System.in);
        do{
            System.out.println("Zarządzanie drużyną");
            System.out.println("Co chcesz zrobić?");
            System.out.println("0. Wyjdź");
            System.out.println("1. Wyświetl zawodników z drużyny");
            System.out.println("2. Edytuj reprezentację drużyny");
            System.out.println("3. Kup przedmioty ze sklepu");
            opcja = skaner.nextInt();
            if (opcja == 1){
                zawodnicy(druzyna);
            }
            if (opcja == 2){
                reprezentacja(druzyna);
            }
            if (opcja == 3){
                kupPrzedmioty(druzyna);
            }
        }while (opcja != 0);
    }
    public void zawodnicy(Druzyna druzyna){
        int opcja1 =0;
        Scanner skaner = new Scanner(System.in);
        do{
            System.out.println("Zawodnicy:");
            druzyna.wyswietlZawodnikow();
            System.out.println();
            System.out.println("Pokaż szczególy zawodnika");
            System.out.println("Wciśnij 0 aby wyjść");
            opcja1 = skaner.nextInt();
            if (opcja1 > 0 && opcja1 <= druzyna.getIloscZawodnikow()) {
                druzyna.getZawodnik(opcja1 - 1).showStaty();
            }
            else {
                if (opcja1 != 0) System.out.println("Nie ma takiego zawodnika");
            }
        }while(opcja1 != 0);
    }
    public void reprezentacja(Druzyna druzyna){
        int opcja2 = 0;
        Scanner skaner = new Scanner(System.in);
        do{
            System.out.println("Reprezentacja:");
            druzyna.wyswietlReprezentacje();
            System.out.println();
            System.out.println("0. Wyjdź");
            System.out.println("1. Pokaż szczególy zawodnika");
            System.out.println("2. Dodaj zawodnika do reprezentacji");
            System.out.println("3. Usuń zawdonika z reprezentacji");
            System.out.println("4. Użyj przedmiotu na zawodniku");
            opcja2 = skaner.nextInt();
            if (opcja2 == 1){
                System.out.println("Który zawodnik?");
                int numerZawodnika = skaner.nextInt();
                if (numerZawodnika > 0 && numerZawodnika <= druzyna.getIloscRep()) {
                    druzyna.getRep(numerZawodnika - 1).showStaty();
                }
                else System.out.println("NIe ma takiego zawodnika");
            }
            if (opcja2 == 2){
                System.out.println("Którego zawodnika chcesz dodać?");
                druzyna.wyswietlZawodnikow();
                int numerZawodnika = skaner.nextInt();
                if (numerZawodnika > 0 && numerZawodnika <= druzyna.getIloscZawodnikow()) {
                    druzyna.dodajDoRep(numerZawodnika - 1);
                }
                else System.out.println("NIe ma takiego zawodnika");
            }
            if (opcja2 == 3){
                System.out.println("Którego zawodnika chcesz usunąć?");
                int numerZawodnika = skaner.nextInt();
                if (numerZawodnika > 0 && numerZawodnika <= druzyna.getIloscRep()) {
                    druzyna.usunZRep(numerZawodnika - 1);
                }
                else System.out.println("Nie ma takiego zawodnika");
            }
            if (opcja2 == 4){
                System.out.println("Na którym zawodniku chcesz użyć przedmiotu?");
                int numerZawodnika = skaner.nextInt();
                System.out.println("Jakiego przedmiotu chcesz użyć?");
                druzyna.wyswietlPrzedmioty();
                int numerPrzedmiotu = skaner.nextInt();
                if (numerZawodnika <= druzyna.getIloscRep() && numerPrzedmiotu <= druzyna.getIloscPrzedmiotow()
                        && numerZawodnika >= 0 && numerPrzedmiotu >= 0) {
                    druzyna.getPrzedmiot(numerPrzedmiotu-1).uzyj(druzyna.getRep(numerZawodnika-1));
                    druzyna.usunPrzedmiot(numerPrzedmiotu-1);
                }
                else System.out.println("Błąd");
            }
        }while(opcja2 != 0);
    }
    public void kupPrzedmioty(Druzyna druzyna){
        Scanner skaner = new Scanner(System.in);
        Piwo piwo = new Piwo();
        Izotonik izotonik = new Izotonik();
        Karnetnasilke karnet = new Karnetnasilke();
        Wzrostanol wzrostanol = new Wzrostanol();
        Steryd steryd = new Steryd();
        LeweDokumenty leweDokumenty = new LeweDokumenty();
        int opcja3 = 0;
        do {
            System.out.println("Saldo: " + druzyna.getSaldo());
            System.out.println("Twoje przedmioty:");
            druzyna.wyswietlPrzedmioty();
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
            opcja3 = skaner.nextInt();
            if (opcja3 == 1){
                if(druzyna.getSaldo() >= piwo.getCena()) {
                    druzyna.dodajPrzedmiot(piwo);
                    druzyna.wyplac(piwo.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (opcja3 == 2){
                if(druzyna.getSaldo() >= izotonik.getCena()) {
                    druzyna.dodajPrzedmiot(izotonik);
                    druzyna.wyplac(izotonik.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (opcja3 == 3){
                if(druzyna.getSaldo() >= karnet.getCena()) {
                    druzyna.dodajPrzedmiot(karnet);
                    druzyna.wyplac(karnet.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (opcja3 == 4){
                if(druzyna.getSaldo() >= wzrostanol.getCena()) {
                    druzyna.dodajPrzedmiot(wzrostanol);
                    druzyna.wyplac(wzrostanol.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (opcja3 == 5){
                if(druzyna.getSaldo() >= steryd.getCena()) {
                    druzyna.dodajPrzedmiot(steryd);
                    druzyna.wyplac(steryd.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (opcja3 == 6){
                if(druzyna.getSaldo() >= leweDokumenty.getCena()) {
                    druzyna.dodajPrzedmiot(leweDokumenty);
                    druzyna.wyplac(leweDokumenty.getCena());
                }
                else System.out.println("Za mało pieniędzy!");
            }
            if (opcja3 != 0 && opcja3 != 1 && opcja3 != 2 && opcja3 != 4 && opcja3 != 5 && opcja3 != 6){
                System.out.println("Nie ma takiego przedmiotu");
            }
        }while(opcja3 != 0);
    }
}
