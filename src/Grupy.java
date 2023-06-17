package src;

import java.util.HashMap;
import java.util.Map;

public class Grupy {
    HashMap<Druzyna, Integer> grupa = new HashMap<>(); // integer to liczba punktow

    Grupy(Druzyna druzyna1, Druzyna druzyna2, Druzyna druzyna3, Druzyna druzyna4) {
        grupa.put(druzyna1, 0);
        grupa.put(druzyna2, 0);
        grupa.put(druzyna3, 0);
        grupa.put(druzyna4, 0);
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
    public Druzyna zwrocNajlepszaDruzyne() {
        Druzyna najlepszaDruzyna = null;
        int maxPunkty = Integer.MIN_VALUE;

        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            int punkty = entry.getValue();
            if (punkty > maxPunkty) {
                najlepszaDruzyna = entry.getKey();
                maxPunkty = punkty;
            }
        }

        return najlepszaDruzyna;
    }

    public void Zagraj1TureMeczuLiny() {

        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);

        MeczLiny meczLiny = new MeczLiny();
        int ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna2);
        }

        ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna3, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna3);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
        System.out.println("Pierwsza Tura \n");
    }

    public void Zagraj2TureMeczuLiny() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczLiny meczLiny = new MeczLiny();
        int ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna3);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }

        ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna2, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
        System.out.println("Druga Tura \n");
    }

    public void Zagraj3TureMeczuLiny() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczLiny meczLiny = new MeczLiny();
        int ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }

        ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna2, druzyna3);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }
        System.out.println("Trzecia Tura \n");
    }
    public void ZagrajPolfinalyMeczuLiny() {
        Druzyna druzyna1 = zwrocNajlepszaDruzyne();
        Druzyna druzyna2 = null;
        Druzyna druzyna3 = null;

        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            if (entry.getValue() == 6 && !entry.getKey().equals(druzyna1)) {
                druzyna2 = entry.getKey();
                break;
            }
        }

        if (druzyna2 == null) {
            return;
        }

        MeczLiny meczLiny = new MeczLiny();
        int ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna2);
        }

        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            if (entry.getValue() == 9 && !entry.getKey().equals(druzyna1)) {
                druzyna3 = entry.getKey();
                break;
            }
        }

        if (druzyna3 == null) {
            return;
        }

        Druzyna druzyna4 = null;

        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            if (entry.getValue() == 6 && !entry.getKey().equals(druzyna1) && !entry.getKey().equals(druzyna3)) {
                druzyna4 = entry.getKey();
                break;
            }
        }

        if (druzyna4 == null) {
            return;
        }

        ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna3, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna3);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }

        System.out.println("Półfinały \n");
    }
    public void ZagrajFinalMeczLiny() {
        Druzyna druzyna1 = null;
        Druzyna druzyna2 = null;

        int maxPunktyGrupa1 = Integer.MIN_VALUE;
        int maxPunktyGrupa2 = Integer.MIN_VALUE;

        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            Druzyna druzyna = entry.getKey();
            int punkty = entry.getValue();

            if (punkty > maxPunktyGrupa1) {
                maxPunktyGrupa1 = punkty;
                druzyna1 = druzyna;
            }
        }

        for (Map.Entry<Druzyna, Integer> entry : grupa.entrySet()) {
            Druzyna druzyna = entry.getKey();
            int punkty = entry.getValue();

            if (punkty > maxPunktyGrupa2 && !druzyna.equals(druzyna1)) {
                maxPunktyGrupa2 = punkty;
                druzyna2 = druzyna;
            }
        }

        if (druzyna1 == null || druzyna2 == null) {
            System.out.println("Nie znaleziono odpowiednich drużyn do finału.");
            return;
        }

        MeczLiny meczLiny = new MeczLiny();
        int ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);

        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna2);
        }

        System.out.println("Finał \n");
    }

}