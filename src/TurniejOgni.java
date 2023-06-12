package src;
import java.util.List;
import java.util.ArrayList;

public class TurniejOgni extends Turniej{

    public TurniejOgni(String nazwa, List<Sedzia> listaSedziow){
        super(nazwa, listaSedziow);
    }


    public void DodajMecz(List<Sedzia> sedziowie, Druzyna druzyna1, Druzyna druzyna2){
        Mecz mecz = new MeczOgni(ListaSedziow.get(0), druzyna1, druzyna2);
    }

}
