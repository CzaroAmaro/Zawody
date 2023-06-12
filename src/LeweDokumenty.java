package src;
import src.Przedmiot;

public class LeweDokumenty extends Przedmiot {
    public LeweDokumenty(){
        super(50);
    }
    public void opis(){
        System.out.println("Pozwala na zmianę imienia danego zawodnika");
    }
    public String toString(){
        return "Lewe dokumenty";
    }

}
