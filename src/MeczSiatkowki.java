package src;

import java.io.Serializable;
import java.util.Random;

public class MeczSiatkowki extends Mecz implements Serializable {

    public int rozegrajMecz(Sedzia Sedzia, Sedziapom Sedziapom1, Sedziapom Sedziapom2, Druzyna druzyna1, Druzyna druzyna2){

        int luck1 = obliczSzczescie(druzyna1);
        int luck2 = obliczSzczescie(druzyna2);

        int sumaW1 = obliczSumeWzrostu(druzyna1);
        int sumaW2 = obliczSumeWzrostu(druzyna2);

        int sumaS1 = obliczSumeSzybkosci(druzyna1);
        int sumaS2 = obliczSumeSzybkosci(druzyna2);

        int suma1 = luck1 + sumaW1 + sumaS1;
        int suma2 = luck2 + sumaW2 + sumaS2;

        if(suma1 > suma2){
            System.out.println("Mecz wygrany przez drużynę nr1"+ "\n" +"Mecz nadzorował Sędzia: " + Sedzia.getNazwisko() + "oraz 2 sędziów" +
                    "pomocnicznych: " + Sedziapom1.getNazwisko() + " " + Sedziapom2.getNazwisko() );
            return 1;
        }

        else{
            System.out.println("Mecz wygrany przez drużynę nr2"+ "\n" +"Mecz nadzorował Sędzia: " + Sedzia.getNazwisko() + "oraz 2 sędziów" +
                    "pomocnicznych: " + Sedziapom1.getNazwisko() + " " + Sedziapom2.getNazwisko() );
            return 2;
        }


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

        int luck = x.nextInt(20)+80;

        return luck;
    }

}
