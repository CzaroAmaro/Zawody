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
}