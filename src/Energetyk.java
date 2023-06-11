import src.Przedmiot;

public class Energetyk extends Przedmiot {
    public Energetyk(){
        super(20);
    }
    public void opis(){
        System.out.println("Zmniejsza zmęczenie danego zawodnika o 20");
        System.out.println("Czas działania: permanentne");
    }
    public String toString(){
        return "Energetyk";
    }
}
