package src;

public class Izotonik extends Przedmiot {
    public Izotonik(){
        super(40);
    }
    public void opis(){
        System.out.println("Zwiększa szybkość i refleks danego zawodnika o 10");
    }
    public void uzyj(Zawodnik zawodnik){
        zawodnik.addSzybkosc(10);
        zawodnik.addRefleks(10);
    }
    public String toString(){
        return "Napój izotoniczny";
    }
}
