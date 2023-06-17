package src;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Turniej {
    protected String nazwaTurnieju;
    public List<Druzyna> ListaDruzyn;
    public List<Sedzia> ListaSedziow;
    public List<Sedziapom> ListaSedziowpom;
    public List<Mecz> ListaMeczy;
    public List<Mecz> ListaPolfinaly;
    public HashMap<Druzyna, Integer> ListaGrupy1;
    public HashMap<Druzyna, Integer> ListaGrupy2;
    public Mecz MeczFinalowy;
    public Mecz Mecz3Miejsce;
    public int liczbaDruzyn = 0;

    public Turniej() {

    }

    public Turniej(String nazwa, List<Sedzia> listaSedziow) {
        nazwaTurnieju = nazwa;
        ListaSedziow = listaSedziow;
        ListaDruzyn = new ArrayList<>();
        ListaMeczy = new ArrayList<>();
        ListaPolfinaly = new ArrayList<>();

    }

    public void DodajDruzyne(Druzyna zglaszanaDruzyna) {
        if (ListaMeczy.size() != 0)
            System.out.println("Nie można dodać drużyny do rozpoczętego turnieju");

        ListaDruzyn.add(zglaszanaDruzyna);
    }

    public void WycofajDruzyne(Druzyna wycofywanaDruzyna) {

        int x = wycofywanaDruzyna.druzynaID;
        ListaDruzyn.remove(x - 1);
    }

    public void WystarturTurniej() {
        liczbaDruzyn = ListaDruzyn.size();
        if (liczbaDruzyn == 8 || liczbaDruzyn == 16)
            UstalGrupy();
        else
            System.out.println("Niewłaściwa ilość drużyn");


    }

    public void UstalGrupy() {
        if (liczbaDruzyn == 8) {
            for (int i = 0; i < 8; i++) {
                if (i < 4)
                    ListaGrupy1.put(ListaDruzyn.get(i), 0);
                else
                    ListaGrupy2.put(ListaDruzyn.get(i), 0);
            }

        } else if (liczbaDruzyn == 16) {
            for (int i = 0; i < 16; i++) {
                if (i < 8)
                    ListaGrupy1.put(ListaDruzyn.get(i), 0);
                else
                    ListaGrupy2.put(ListaDruzyn.get(i), 0);

            }
        }
    }

    public void RozegrajMeczLiny(Sedzia sedzia, Druzyna druzyna1, Druzyna druzyna2, HashMap<Druzyna, Integer> listaDruzyn) { //ma koncu wrzucamy grupe
        MeczLiny mecz = new MeczLiny();
        int ktoWygral = mecz.rozegrajMecz(sedzia, druzyna1, druzyna2);

        if (ktoWygral == 1) {
            int ilePunktow = druzyna1.getPunkty() + 3;
            listaDruzyn.replace(druzyna1, ilePunktow);
            druzyna1.dodajpunkty(3);
        }
        if (ktoWygral == 2) {
            int ilePunktow = druzyna1.getPunkty() + 3;
            listaDruzyn.replace(druzyna1, ilePunktow);
            druzyna1.dodajpunkty(3);
        }
    }

    public void RozegrajMeczOgni(Sedzia sedzia, Druzyna druzyna1, Druzyna druzyna2, HashMap<Druzyna, Integer> listaDruzyn) { //
        MeczLiny mecz = new MeczLiny();
        int ktoWygral = mecz.rozegrajMecz(sedzia, druzyna1, druzyna2);

        if (ktoWygral == 1) {
            int ilePunktow = druzyna1.getPunkty() + 3;
            listaDruzyn.replace(druzyna1, ilePunktow);
            druzyna1.dodajpunkty(3);
        }
        if (ktoWygral == 2) {
            int ilePunktow = druzyna1.getPunkty() + 3;
            listaDruzyn.replace(druzyna1, ilePunktow);
            druzyna1.dodajpunkty(3);
        }
    }

    public void RozegrajMeczSiatkowki(Sedzia sedzia, Druzyna druzyna1, Druzyna druzyna2, HashMap<Druzyna, Integer> listaDruzyn) { //ma koncu wrzucamy grupe
        MeczLiny mecz = new MeczLiny();
        int ktoWygral = mecz.rozegrajMecz(sedzia, druzyna1, druzyna2);

        if (ktoWygral == 1) {
            int ilePunktow = druzyna1.getPunkty() + 3;
            listaDruzyn.replace(druzyna1, ilePunktow);
            druzyna1.dodajpunkty(3);
        }
        if (ktoWygral == 2) {
            int ilePunktow = druzyna1.getPunkty() + 3;
            listaDruzyn.replace(druzyna1, ilePunktow);
            druzyna1.dodajpunkty(3);
        }
    }
    public void RozegrajMecze() {

    }

}
