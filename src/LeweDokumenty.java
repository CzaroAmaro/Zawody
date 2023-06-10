public class LeweDokumenty extends Przedmiot {
    public LeweDokumenty(){
        super(50);
    }
    public void opis(){
        System.out.println("Pozwala na zmianę imienia danego zawodnika");
        System.out.println("Czas działania: permanentne");
    }
    public String toString(){
        return "Lewe dokumenty";
    }

}
