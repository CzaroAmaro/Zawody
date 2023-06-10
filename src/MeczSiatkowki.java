package src;

import java.io.Serializable;
import java.util.Random;

public class MeczSiatkowki extends Mecz implements Serializable {

    public MeczSiatkowki(Sedzia Sedzia, Sedziapom Sedziapom1, Sedziapom Sedziapom2, Druzyna druzyna1, Druzyna druzyna2){
        this.Sedzia = Sedzia;
        this.Sedziapom = Sedziapom1;
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;

        int luck1 = obliczSzczescie(druzyna1);
        int luck2 = obliczSzczescie(druzyna2);

        int sumaW1 = obliczSumeWzrostu(druzyna1);
        int sumaW2 = obliczSumeWzrostu(druzyna2);

        int sumaS1 = obliczSumeSzybkosci(druzyna1);
        int sumaS2 = obliczSumeSzybkosci(druzyna2);


    }
    private int obliczSumeWzrostu(Druzyna druzyna){
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getWzrost();
        }
        return suma;
    }

    private int obliczSumeSzybkosci(Druzyna druzyna){
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getSzybkosc();
        }
        return suma;
    }

    private int obliczSzczescie(Druzyna druzyna){
        Random x = new Random();

        int luck = x.nextInt(80,101);

        return luck;
    }

}
