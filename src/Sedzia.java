package src;
import java.io.Serializable;
import java.util.List;

public class Sedzia implements Serializable{
    private String nazwisko;

    public Sedzia(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public static void Dodajsedziego(String nazwisko, List<Sedzia> listaSedziow){
       Sedzia nowySedzia = new Sedzia(nazwisko);
       listaSedziow.add(nowySedzia);
        System.out.println("Dodano sedziego:" + nazwisko);


    }
}
