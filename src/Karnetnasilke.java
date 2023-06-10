public class Karnetnasilke extends Przedmiot{
    public Karnetnasilke(){
        super(120);
    }
    public void opis(){
        System.out.println("Zwiększa siłę, szybkość oraz refleks danego zawodnika o 10");
        System.out.println("Czas działania: permanentne");
    }
    public String toString(){
        return "Karnet na siłownie";
    }
}
