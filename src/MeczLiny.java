package src;

import java.util.Random;
import java.io.Serializable;

public class MeczLiny extends Mecz implements Serializable {
    public MeczLiny(Sedzia Sedzia, Druzyna druzyna1, Druzyna druzyna2){
        this.Sedzia = Sedzia;
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;

        int luck1 = obliczSzczescie(druzyna1);
        int luck2 = obliczSzczescie(druzyna2);

        int sumaS1 = obliczSumeSily(druzyna1);
        int sumaS2 = obliczSumeSily(druzyna2);

        int sumaM1 = obliczSumeMasy(druzyna1);
        int sumaM2 = obliczSumeMasy(druzyna2);

        for (int i = 0; i < 6; i++){
            druzyna1.getRep(i).zagral();
        }
        for (int j = 0; j < 6; j++){
            druzyna2.getRep(j).zagral();
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



    @Override
    public String toString(){
        return super.toString() + druzyna1.nazwaDruzyny + "vs" + druzyna2.nazwaDruzyny
                + "Zwyciezca: " + druzynaWygrana.nazwaDruzyny
                + "Sedzia: " + Sedzia + "\n";
    }


}
