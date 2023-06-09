package src;

import java.util.ArrayList;
public class Sklep {
    private static ArrayList<Zawodnik> zawodnicydowyboru = new ArrayList<Zawodnik>();
    private static int ilosc = 0;
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
