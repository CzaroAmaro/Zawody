package src;

import java.io.Serializable;
import java.util.Random;

public class MeczOgni extends Mecz implements Serializable {
    public int MeczOgni(Sedzia Sedzia, Druzyna druzyna1, Druzyna druzyna2){
        this.Sedzia = Sedzia;
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;

        int luck1 = obliczSzczescie(druzyna1);
        int luck2 = obliczSzczescie(druzyna2);

        int sumaC1 = obliczSumeCelnosci(druzyna1);
        int sumaC2 = obliczSumeCelnosci(druzyna2);

        int sumaR1 = obliczSumeRefleksu(druzyna1);
        int sumaR2 = obliczSumeRefleksu(druzyna2);

        int suma1 = luck1 + sumaC1 + sumaR1;
        int suma2 = luck2 + sumaC2 + sumaR2;

        if(suma1 > suma2)
            return 1;
        else
            return 2;
    }

    private int obliczSumeCelnosci(Druzyna druzyna){
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getCelnosc();
        }
        return suma;
    }


    private int obliczSumeRefleksu(Druzyna druzyna){
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getRefleks();
        }
        return suma;
    }

    private int obliczSzczescie(Druzyna druzyna){
        Random x = new Random();

        int luck = x.nextInt(80,101);

        return luck;
    }

}
