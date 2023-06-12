package src;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;


public class SystemTurniejow{
    public List<Sedzia> listaSedziow;
    public List<Turniej> listaTurniejow;


    public SystemTurniejow(){
        listaSedziow = new ArrayList<>();
        listaTurniejow = new ArrayList<>();
    }

    public void ZapisDoPliku(String sciezkaSedziowie, String sciezkaTurniejeLiny, String sciezkaTurniejeOgni, String sciezkaTurniejeSiatkowki, String sciezkaMeczeLiny, String sciezkaMeczeOgnia, String sciezkaMeczeSiatkowki, String sciezkaDruzyn) {
        try (PrintWriter writerSedziowie = new PrintWriter(new FileWriter(sciezkaSedziowie));
             PrintWriter writerTurniejeLiny = new PrintWriter(new FileWriter(sciezkaTurniejeLiny));
             PrintWriter writerTurniejeOgni = new PrintWriter(new FileWriter(sciezkaTurniejeOgni));
             PrintWriter writerTurniejeSiatkowki = new PrintWriter(new FileWriter(sciezkaTurniejeSiatkowki));
             PrintWriter writerMeczeLiny = new PrintWriter(new FileWriter(sciezkaMeczeLiny));
             PrintWriter writerMeczeOgnia = new PrintWriter(new FileWriter(sciezkaMeczeOgnia));
             PrintWriter writerMeczeSiatkowki = new PrintWriter(new FileWriter(sciezkaMeczeSiatkowki));
             PrintWriter writerDruzyny = new PrintWriter(new FileWriter(sciezkaDruzyn))) {

            // Zapisujemy listę sedziów
            for (Sedzia sedzia : listaSedziow) {
                writerSedziowie.println(sedzia.toString());
            }

            // Zapisujemy turnieje liny
            for (Turniej turniej : listaTurniejow) {
                if (turniej instanceof TurniejLiny) {
                    writerTurniejeLiny.println(turniej.toString());
                }
            }

            // Zapisujemy turnieje ogni
            for (Turniej turniej : listaTurniejow) {
                if (turniej instanceof TurniejOgni) {
                    writerTurniejeOgni.println(turniej.toString());
                }
            }

            // Zapisujemy turnieje siatkówki
            for (Turniej turniej : listaTurniejow) {
                if (turniej instanceof TurniejSiatkowki) {
                    writerTurniejeSiatkowki.println(turniej.toString());
                }
            }

            // Zapisujemy mecze liny
            for (Turniej turniej : listaTurniejow) {
                for (Mecz mecz : turniej.ListaMeczy) {
                    if (mecz instanceof MeczLiny) {
                        writerMeczeLiny.println(mecz.toString());
                    }
                }
            }

            // Zapisujemy mecze ogni
            for (Turniej turniej : listaTurniejow) {
                for (Mecz mecz : turniej.ListaMeczy) {
                    if (mecz instanceof MeczOgni) {
                        writerMeczeOgnia.println(mecz.toString());
                    }
                }
            }

            // Zapisujemy mecze siatkówki
            for (Turniej turniej : listaTurniejow) {
                for (Mecz mecz : turniej.ListaMeczy) {
                    if (mecz instanceof MeczSiatkowki) {
                        writerMeczeSiatkowki.println(mecz.toString());
                    }
                }
            }

            // Zapisujemy drużyny
            for (Turniej turniej : listaTurniejow) {
                for (Druzyna druzyna : turniej.ListaDruzyn) {
                    if (druzyna instanceof Druzyna) {
                        writerDruzyny.println(druzyna.toString());
                    }
                }
            }

            System.out.println("Zapisano dane do plików.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
