package src;
import src.Przedmiot;


public class Karnetnasilke extends Przedmiot {
    public Karnetnasilke(){
        super(120);
    }
    public void opis(){
        System.out.println("Zwiększa siłę, szybkość oraz refleks danego zawodnika o 10");
    }
    public void uzyj(Zawodnik a){
        a.addSila(10);
        a.addRefleks(10);
        a.addSzybkosc(10);
    }
    public String toString(){
        return "Karnet na siłownie";
    }
}
