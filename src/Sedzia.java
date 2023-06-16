package src;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sedzia implements Serializable{
    private String nazwisko;
    List<Sedzia> listaSedziow = new ArrayList<>();

    public Sedzia(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public String getNazwisko(){
        return nazwisko;
    }

    public static void dodajSedziego(String nazwisko, List<Sedzia> listaSedziow){
       Sedzia nowySedzia = new Sedzia(nazwisko);
       listaSedziow.add(nowySedzia);
        System.out.println("Dodano sedziego:" + nazwisko);
    }
    public static void usunSedziego(String nazwisko, List<Sedzia> listaSedziow){
        listaSedziow.remove(nazwisko);
    }
    public static void wyswietlSedziow(List<Sedzia> listaSedziow){
        int index = 1;
        for(Sedzia sedzia : listaSedziow) {
            System.out.println(index + " " + sedzia.getNazwisko());
            index ++;
        }
    }
}
