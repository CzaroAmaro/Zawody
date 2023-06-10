public class Wzrostanol extends Przedmiot{
    public Wzrostanol(){
        super(20);
    }
    public void opis(){
        System.out.println("Zwiększa wzrost danego zawodnika o 20cm");
        System.out.println("Czas działania: permamentne");
    }
    public String toString(){
        return "Wzrostanol";
    }
}
