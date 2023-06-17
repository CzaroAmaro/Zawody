package src;

import java.util.HashMap;
import java.util.Map;

public class Grupy {
    HashMap<Druzyna, Integer> grupa = new HashMap<>(); // integer to liczba punktow
    Grupy(Druzyna druzyna1,Druzyna druzyna2,Druzyna druzyna3,Druzyna druzyna4) {
        grupa.put(druzyna1, 0 );
        grupa.put(druzyna2, 0 );
        grupa.put(druzyna3, 0 );
        grupa.put(druzyna4, 0 );
    }
    public void dodajPunktyDruzynie(Druzyna dr) {
        int poprzedniWynik = grupa.get(dr);
        int nowyWynik = poprzedniWynik + 3;
        grupa.put(dr, nowyWynik);
    }
    public void wyswietlGrupe() {
        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            String nazwa = entry.getKey().getNazwa();
            Integer punkty = entry.getValue();
            System.out.println("Nazwa Druzyny: " + nazwa + ", Punkty: " + punkty);
        }
    }
    public Druzyna zwrocDruzyne(int index) {
        Druzyna zwracana = new Druzyna();
        int i = 0;
        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            if (i == index) {
                zwracana = entry.getKey();
                break;
            }
            i++;
        }
        return zwracana;
    }
    public void Zagraj1TureMeczuLiny() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczLiny meczLiny = new MeczLiny();
        int ktoWygraŁ = meczLiny.rozegrajMecz(Sedzia.getSedzia(),druzyna1, druzyna2);
        if(ktoWygraŁ == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna2);
        }

        ktoWygraŁ = meczLiny.rozegrajMecz(Sedzia.getSedzia(),druzyna3, druzyna4);
        if(ktoWygraŁ == 1) {
            dodajPunktyDruzynie(druzyna3);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
    }

    public void Zagraj2TureMeczuLiny() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczLiny meczLiny = new MeczLiny();
        int ktoWygraŁ = meczLiny.rozegrajMecz(Sedzia.getSedzia(),druzyna1, druzyna3);
        if(ktoWygraŁ == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }

        ktoWygraŁ = meczLiny.rozegrajMecz(Sedzia.getSedzia(),druzyna2, druzyna4);
        if(ktoWygraŁ == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
    }

    public void Zagraj3TureMeczuLiny() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczLiny meczLiny = new MeczLiny();
        int ktoWygraŁ = meczLiny.rozegrajMecz(Sedzia.getSedzia(),druzyna1, druzyna4);
        if(ktoWygraŁ == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }

        ktoWygraŁ = meczLiny.rozegrajMecz(Sedzia.getSedzia(),druzyna2, druzyna3);
        if(ktoWygraŁ == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }
    }
}