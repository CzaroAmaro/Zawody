package src;
import src.Przedmiot;
import java.util.Scanner;

public class LeweDokumenty extends Przedmiot {
    public LeweDokumenty(){
        super(50);
    }
    public void opis(){
        System.out.println("Pozwala na zmianę imienia danego zawodnika");
        System.out.println("Czas działania: permanentne");
    }
    public void uzyj(Zawodnik zawodnik){
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj nowe imię:");
        String noweimie = skaner.next();
        zawodnik.zmienImie(noweimie);
    }
    public String toString(){
        return "Lewe dokumenty";
    }

}
