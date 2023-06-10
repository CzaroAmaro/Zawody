public class Izotonik extends Przedmiot{
    public Izotonik(){
        super(40);
    }
    public void opis(){
        System.out.println("Zwiększa szybkość i refleks danego zawodnika o 10");
        System.out.println("Czas działania: jeden mecz");
    }
    public String toString(){
        return "Napój izotoniczny";
    }
}
