package src;

import java.util.Random;
import java.io.Serializable;

public class MeczLiny extends Mecz implements Serializable {
    public int rozegrajMecz(Sedzia Sedzia, Druzyna druzyna1, Druzyna druzyna2){

        int luck1 = obliczSzczescie(druzyna1);
        int luck2 = obliczSzczescie(druzyna2);

        int sumaS1 = obliczSumeSily(druzyna1);
        int sumaS2 = obliczSumeSily(druzyna2);

        int sumaM1 = obliczSumeMasy(druzyna1);
        int sumaM2 = obliczSumeMasy(druzyna2);


        int suma1 = luck1 + sumaS1 + sumaM1;
        int suma2 = luck2 + sumaS2 + sumaM2;

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
    private int obliczSumeSily(Druzyna druzyna){
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getSila();
        }
        return suma;
    }

    private int obliczSumeMasy(Druzyna druzyna) {
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += druzyna.getRep(i).getWaga();
        }
        return suma;
    }
    private int obliczSzczescie(Druzyna druzyna){
        Random x = new Random();

        int luck = x.nextInt(80,101);

        return luck;
    }
}
