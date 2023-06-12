package src;
public class Piwo extends Przedmiot{
    public Piwo(int cena){
        super(cena);
    }
    public void opis(){
        System.out.println("Zwiększa siłę o 10, ale zmniejsza celność o 20");
    }
   public void uzyj(Zawodnik a){
        a.addSila(10);
        a.addCelnosc(-20);
    }
    public String toString(){
        return "Piwo";
    }
}
