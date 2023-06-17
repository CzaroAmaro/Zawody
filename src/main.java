package src;

public class main {
    public static void main(String[] args) {
        Wyspa wyspa = new Wyspa();

        Grupy grupaA = wyspa.stworzGrupe();
        Grupy grupaB = wyspa.stworzGrupe();

        MeczLiny meczLiny = new MeczLiny();
        Sedzia testowy = new Sedzia("janek");

        Druzyna druzyna1 = grupaA.zwrocDruzyne(0);
        Druzyna druzyna2 = grupaA.zwrocDruzyne(1);

        int ktoWygraŁ = meczLiny.rozegrajMecz(testowy,druzyna1, druzyna2);

        if(ktoWygraŁ == 1) {
            grupaA.dodajPunktyDruzynie(druzyna1);
        } else {
            grupaA.dodajPunktyDruzynie(druzyna2);
        }

        System.out.println("Grupa A");
        grupaA.wyswietlGrupe();

        System.out.println("Grupa B");
        grupaB.wyswietlGrupe();

    }
}
