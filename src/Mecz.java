package src;

import java.io.Serializable;

public class Mecz implements Serializable {

    public Druzyna druzynaWygrana;
    public int meczID;
    public static int currentID = 1;

    public Mecz(){
        meczID = currentID;
        currentID += 1;
        this.druzynaWygrana = new Druzyna();
        druzynaWygrana.nazwaDruzyny = "brak";
    }

    @Override
    public String toString(){
        String s = meczID + ".";
        return s;
    }

}
