package src;
import java.util.ArrayList;
import java.util.List;

public abstract class Turniej {
    protected String nazwaTurnieju;
    public List<Druzyna> ListaDruzyn;
    public List<Sedzia> ListaSedziow;
    public List<Sedziapom> ListaSedziowpom;
    public List<Mecz> ListaMeczy;
    public List<Mecz> ListaPolfinaly;
    public Mecz MeczFinalowy;
    public Mecz Mecz3Miejsce;

    public Turniej(String nazwa, List<Sedzia> listaSedziow ){
        nazwaTurnieju = nazwa;
        ListaSedziow = listaSedziow;
        ListaDruzyn = new ArrayList<>();
        ListaMeczy = new ArrayList<>();
        ListaPolfinaly = new ArrayList<>();

    }

    public void DodajDruzyne(Druzyna zglaszanaDruzyna){
        if(ListaMeczy.size() != 0)
            System.out.println("Nie można dodać drużyny do rozpoczętego turnieju");

        ListaDruzyn.add(zglaszanaDruzyna);
    }

    public void WycofajDruzyne(Druzyna wycofywanaDruzyna){

        int x = wycofywanaDruzyna.druzynaID;
        ListaDruzyn.remove(x-1);
    }



}
