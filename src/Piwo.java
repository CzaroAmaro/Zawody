package src;
public class Piwo extends Przedmiot{
    public Piwo(){
        super(50);
    }
    public void opis(){
        System.out.println("Zwiększa siłę o 20, ale zmniejsza celność o 20");
    }
   public void uzyj(Zawodnik zawodnik){
        zawodnik.addSila(20);
        zawodnik.addCelnosc(-20);
    }
    public String toString(){
        return "Piwo";
    }
}
