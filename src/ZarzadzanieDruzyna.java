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
            if (b>0) {
                druzyna.getZawodnik(b - 1).showStaty();
            }
            if(b<0) {
                System.out.println("Bład");
            }
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
                System.out.println("Który zawodnik?");
                int b = x.nextInt();
                druzyna.getZawodnik(b-1).showStaty();
            }
            if (c==2){
                System.out.println("Którego zawodnika chcesz dodać?");
                druzyna.wyswietlZawodnikow();
                int b = x.nextInt();
                druzyna.dodajDoRep(b-1);
            }
            if (c==3){
                System.out.println("Którego zawodnika chcesz usunąć?");
                int b = x.nextInt();
                druzyna.usunZRep(b-1);
            }
            if (c==4){
                System.out.println("Na którym zawodniku chcesz użyć przedmiotu?");
                int bb = x.nextInt()-1;
                System.out.println("Jakiego przedmiotu chcesz użyć?");
                druzyna.wyswietlPrzedmioty();
                int cc = x.nextInt()-1;
                if (bb > druzyna.getIloscRep() || cc > druzyna.getIloscPrzedmiotow()) {
                    druzyna.getPrzedmiot(cc).uzyj(druzyna.getRep(bb));
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
            System.out.println("3. Napój izotoniczny cena: " + izotonik.getCena());
            izotonik.opis();
            System.out.println();
            System.out.println("4. Karnet na siłownie cena: " + karnet.getCena());
            karnet.opis();
            System.out.println();
            System.out.println("5. Wzrostanol cena: " + wzrostanol.getCena());
            wzrostanol.opis();
            System.out.println();
            System.out.println("6. Steryd cena: " + steryd.getCena());
            steryd.opis();
            System.out.println();
            System.out.println("7. Lewe dokumenty cena: " + leweDokumenty.getCena());
            leweDokumenty.opis();
            System.out.println();
            System.out.println("0. Wyjdź");
            d = x.nextInt();
            if (d == 1){
                druzyna.dodajPrzedmiot(piwo);
                druzyna.wyplac(piwo.getCena());
            }
            if (d == 2){
                druzyna.dodajPrzedmiot(izotonik);
                druzyna.wyplac(izotonik.getCena());
            }
            if (d == 3){
                druzyna.dodajPrzedmiot(karnet);
                druzyna.wyplac(karnet.getCena());
            }
            if (d == 4){
                druzyna.dodajPrzedmiot(wzrostanol);
                druzyna.wyplac(wzrostanol.getCena());
            }
            if (d == 5){
                druzyna.dodajPrzedmiot(steryd);
                druzyna.wyplac(steryd.getCena());
            }
            if (d == 6){
                druzyna.dodajPrzedmiot(leweDokumenty);
                druzyna.wyplac(leweDokumenty.getCena());
            }
        }while(d!=0);
    }
}
