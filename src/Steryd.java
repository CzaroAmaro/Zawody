package src;

public class Steryd extends Przedmiot {
    public Steryd(){
        super(40);
    }
    public void opis(){
        System.out.println("Zwiększa siłe zawodnika o 10, zwiększa masę o 20kg, ale obniża szybkość oraz refleks o 10");
    }
    public void uzyj(Zawodnik a){
        a.addSila(10);
        a.addWaga(20);
        a.addRefleks(-10);
    }
    public String toString(){
        return "Steryd";
    }
}
