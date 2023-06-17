package src;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sedzia implements Serializable{
    private String nazwisko;
    private static List<Sedzia> listaSedziow = new ArrayList<>();

    public Sedzia(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public static Sedzia getSedzia(){
        if(listaSedziow.isEmpty()){
            System.out.println("Brak dostepnych sedziow.");
        }
        Random random = new Random();
        int index = random.nextInt(listaSedziow.size());
        return listaSedziow.get(index);
    }


    public static void dodajSedziego(String nazwisko){
       Sedzia nowySedzia = new Sedzia(nazwisko);
       listaSedziow.add(nowySedzia);
        System.out.println("Dodano sedziego:" + nazwisko);
    }
    public static void usunSedziego(int x){
        listaSedziow.remove(x-1);
    }
    public static void wyswietlSedziow(){
        int index = 1;
        for(Sedzia sedzia : listaSedziow) {
            System.out.println(index + " " + sedzia.getNazwisko());
            index ++;
        }
    }
}
