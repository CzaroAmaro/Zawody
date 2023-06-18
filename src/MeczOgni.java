package src;

import java.io.Serializable;
import java.util.Random;

public class MeczOgni extends Mecz implements Serializable {

    public int rozegrajMecz(Sedzia Sedzia, Druzyna druzyna1, Druzyna druzyna2) {
        int luck1 = obliczSzczescie(druzyna1);
        int luck2 = obliczSzczescie(druzyna2);

        int sumaC1 = obliczSumeCelnosci(druzyna1);
        int sumaC2 = obliczSumeCelnosci(druzyna2);

        int sumaR1 = obliczSumeRefleksu(druzyna1);
        int sumaR2 = obliczSumeRefleksu(druzyna2);

        int suma1 = luck1 + sumaC1 + sumaR1;
        int suma2 = luck2 + sumaC2 + sumaR2;

        System.out.println("Mecz " + druzyna1.getNazwaDruzyny() + " " + "vs" + " " + druzyna2.getNazwaDruzyny());

        if(suma1 > suma2){
            System.out.println("Mecz wygrany przez drużynę " + druzyna1.getNazwaDruzyny() + "\n" +"Mecz nadzorował Sędzia: " + Sedzia.getNazwisko());
            return 1;
        }

        else{
            System.out.println("Mecz wygrany przez drużynę " + druzyna2.getNazwaDruzyny() + "\n" +"Mecz nadzorował Sędzia: " + Sedzia.getNazwisko());
            return 2;
        }
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

        int luck = x.nextInt(20)+80;

        return luck;
    }

}
