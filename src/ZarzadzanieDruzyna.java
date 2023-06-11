package src;

import java.util.Scanner;
public class ZarzadzanieDruzyna {
    public void zarzadzanie(Druzyna druzyna){
        int a=0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Zarządzanie drużyną");
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Wyświetl zawodników z drużyny");
            System.out.println("2. Edytuj reprezentację drużyny");
            System.out.println("3. Kup przedmioty ze sklepu");
            System.out.println("Wciśnij 0 aby wyjść");
            a = x.nextInt();
            if (a == 1){
                zawodnicy(druzyna);
            }
            if (a == 2){
                reprezentacja(druzyna);
            }
            if (a == 3){
                kupPrzedmioty(druzyna);
            }
        }while (a !=0);
    }
    public void zawodnicy(Druzyna druzyna){
        int a=0;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Zawodnicy:");
            druzyna.wyswietlZawodnikow();
            System.out.println();
            System.out.println("Pokaż szczególy zawodnika");
            System.out.println("Wciśnij 0 aby wyjść");
            a = x.nextInt();
            if (a>0) {
                druzyna.getZawodnik(a - 1).showStaty();
            }
            if(a<0) {
                System.out.println("Bład");
            }
        }while(a!=0);
    }
    public void reprezentacja(Druzyna druzyna){
        int a=0;
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
            a = x.nextInt();
            if (a==1){
                System.out.println("Który zawodnik?");
                int b = x.nextInt();
                druzyna.getZawodnik(b-1).showStaty();
            }
            if (a==2){
                System.out.println("Którego zawodnika chcesz dodać?");
                druzyna.wyswietlZawodnikow();
                int b = x.nextInt();
                druzyna.dodajDoRep(b-1);
            }
            if (a==3){
                System.out.println("Którego zawodnika chcesz usunąć?");
                int b = x.nextInt();
                druzyna.usunZRep(b-1);
            }
            if (a==4){
                System.out.println("Na którym zawodniku chcesz użyć przedmiotu?");
                int b = x.nextInt();
                System.out.println("Jakiego przedmiotu chcesz użyć?");
                druzyna.wyswietlPrzedmioty();
                int c = x.nextInt();
            }
        }while(a!=0);
    }
    public void kupPrzedmioty(Druzyna druzyna){

    }
}
