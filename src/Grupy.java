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
    Grupy() {

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
        grupa.remove(najlepszaDruzyna);
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
    public Druzyna ZagrajPolfinalyMeczuLiny(Druzyna druzyna1, Druzyna druzyna2) {

        MeczLiny meczLiny = new MeczLiny();
        int ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            System.out.println("Wygrała Druzyna: " + druzyna1.getNazwa() + " I przechodzi do Finalu!!");
            return  druzyna1;
        } else {
            System.out.println("Wygrała Druzyna: " + druzyna2.getNazwa() + " I przechodzi do Finalu!!");
            return  druzyna2;
        }
    }
    public void ZagrajFinalMeczLiny(Druzyna druzyna1, Druzyna druzyna2) {
        MeczLiny meczLiny = new MeczLiny();
        int ktoWygral = meczLiny.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            System.out.println("Turniej Wygrała Druzyna: " + druzyna1.getNazwa() + " Gratulacje!!");
        } else {
            System.out.println("Turniej Wygrała Druzyna: " + druzyna2.getNazwa() + " Gratulacje!!");
        }
    }

    public void Zagraj1TureMeczuOgni() {

        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);

        MeczOgni meczOgni = new MeczOgni();
        int ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna2);
        }

        ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna3, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna3);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
        System.out.println("Pierwsza Tura \n");
    }

    public void Zagraj2TureMeczuOgni() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczOgni meczOgni = new MeczOgni();
        int ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna3);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }

        ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna2, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
        System.out.println("Druga Tura \n");
    }

    public void Zagraj3TureMeczuOgni() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczOgni meczOgni = new MeczOgni();
        int ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }

        ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna2, druzyna3);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }
        System.out.println("Trzecia Tura \n");
    }
    public Druzyna ZagrajPolfinalyMeczuOgni(Druzyna druzyna1, Druzyna druzyna2) {

        MeczOgni meczOgni = new MeczOgni();
        int ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            System.out.println("Wygrała Druzyna: " + druzyna1.getNazwa() + " I przechodzi do Finalu!!");
            return  druzyna1;
        } else {
            System.out.println("Wygrała Druzyna: " + druzyna2.getNazwa() + " I przechodzi do Finalu!!");
            return  druzyna2;
        }
    }
    public void ZagrajFinalMeczOgni(Druzyna druzyna1, Druzyna druzyna2) {
        MeczOgni meczOgni = new MeczOgni();
        int ktoWygral = meczOgni.rozegrajMecz(Sedzia.getSedzia(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            System.out.println("Turniej Wygrała Druzyna: " + druzyna1.getNazwa() + " Gratulacje!!");
        } else {
            System.out.println("Turniej Wygrała Druzyna: " + druzyna2.getNazwa() + " Gratulacje!!");
        }
    }

    public void Zagraj1TureMeczuSiatkowki() {

        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);



        MeczSiatkowki meczSiatkowki = new MeczSiatkowki();
        int ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(),  new Sedziapom(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna2);
        }

        ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(), new Sedziapom(), druzyna3, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna3);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
        System.out.println("Pierwsza Tura \n");
    }

    public void Zagraj2TureMeczuSiatkowki() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczSiatkowki meczSiatkowki = new MeczSiatkowki();
        int ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(), new Sedziapom(), druzyna1, druzyna3);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }

        ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(), new Sedziapom(), druzyna2, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }
        System.out.println("Druga Tura \n");
    }

    public void Zagraj3TureMeczuSiatkowki() {
        Druzyna druzyna1 = zwrocDruzyne(0);
        Druzyna druzyna2 = zwrocDruzyne(1);
        Druzyna druzyna3 = zwrocDruzyne(2);
        Druzyna druzyna4 = zwrocDruzyne(3);


        MeczSiatkowki meczSiatkowki = new MeczSiatkowki();
        int ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(), new Sedziapom(), druzyna1, druzyna4);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna1);
        } else {
            dodajPunktyDruzynie(druzyna4);
        }

        ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(), new Sedziapom(), druzyna2, druzyna3);
        if (ktoWygral == 1) {
            dodajPunktyDruzynie(druzyna2);
        } else {
            dodajPunktyDruzynie(druzyna3);
        }
        System.out.println("Trzecia Tura \n");
    }
    public Druzyna ZagrajPolfinalyMeczuSiatkowki(Druzyna druzyna1, Druzyna druzyna2) {


        MeczSiatkowki meczSiatkowki = new MeczSiatkowki();
        int ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(), new Sedziapom(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            System.out.println("Wygrała Druzyna: " + druzyna1.getNazwa() + " I przechodzi do Finalu!!");
            return  druzyna1;
        } else {
            System.out.println("Wygrała Druzyna: " + druzyna2.getNazwa() + " I przechodzi do Finalu!!");
            return  druzyna2;
        }
    }
    public void ZagrajFinalMeczSiatkowki(Druzyna druzyna1, Druzyna druzyna2) {


        MeczSiatkowki meczSiatkowki = new MeczSiatkowki();
        int ktoWygral = meczSiatkowki.rozegrajMecz(Sedzia.getSedzia(), new Sedziapom(), druzyna1, druzyna2);
        if (ktoWygral == 1) {
            System.out.println("Turniej Wygrała Druzyna: " + druzyna1.getNazwa() + " Gratulacje!!");
        } else {
            System.out.println("Turniej Wygrała Druzyna: " + druzyna2.getNazwa() + " Gratulacje!!");
        }
    }

}