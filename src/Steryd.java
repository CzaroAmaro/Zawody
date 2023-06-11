import src.Przedmiot;

public class Steryd extends Przedmiot {
    public Steryd(){
        super(40);
    }
    public void opis(){
        System.out.println("Zwiększa siłe zawodnika o 10, zwiększa masę o 20kg, ale obniża szybkość oraz refleks o 10");
        System.out.println("Czas działania: permanentne");
    }
    public String toString(){
        return "Steryd";
    }
}
