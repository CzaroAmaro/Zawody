package src;

public class Wzrostanol extends Przedmiot {
    public Wzrostanol(){
        super(20);
    }
    public void opis(){
        System.out.println("Zwiększa wzrost danego zawodnika o 20cm");
    }
    public void uzyj(Zawodnik a){
        a.addWzrost(20);
    }
    public String toString(){
        return "Wzrostanol";
    }
}
