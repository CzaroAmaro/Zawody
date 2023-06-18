package src;
import src.Przedmiot;


public class Karnetnasilke extends Przedmiot {
    public Karnetnasilke(){
        super(120);
    }
    public void opis(){
        System.out.println("Zwiększa siłę, szybkość oraz refleks danego zawodnika o 10");
    }
    public void uzyj(Zawodnik zawodnik){
        zawodnik.addSila(10);
        zawodnik.addRefleks(10);
        zawodnik.addSzybkosc(10);
    }
    public String toString(){
        return "Karnet na siłownie";
    }
}
