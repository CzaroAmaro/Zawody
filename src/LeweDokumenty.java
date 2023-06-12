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
    public void uzyj(Zawodnik a){
        Scanner x = new Scanner(System.in);
        System.out.println("Podaj nowe imię:");
        a.zmienImie(x.next());
    }
    public String toString(){
        return "Lewe dokumenty";
    }

}
