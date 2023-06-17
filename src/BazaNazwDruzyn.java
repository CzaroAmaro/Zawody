package src;
import java.util.ArrayList;
public class BazaNazwDruzyn {
    private static ArrayList <String> bazaNazwDruzyn  = new ArrayList<>();
    private static int iloscNazw = 21;
    public BazaNazwDruzyn(){
        bazaNazwDruzyn.add("Cagła team");
        bazaNazwDruzyn.add("Białostocka komunikacja miejska");
        bazaNazwDruzyn.add("Dzikie kasztany");
        bazaNazwDruzyn.add("Dżungla team");
        bazaNazwDruzyn.add("Bezbeki");
        bazaNazwDruzyn.add("PROGRAMIŚCIIIII");
        bazaNazwDruzyn.add("Weeb team");
        bazaNazwDruzyn.add("Wuefiści team");
        bazaNazwDruzyn.add("Paśnik team");
        bazaNazwDruzyn.add("Zdana sesja");
        bazaNazwDruzyn.add("Krzysztof Tyniec fanbois");
        bazaNazwDruzyn.add("Ninjów garść");
        bazaNazwDruzyn.add("Franklin i przyjaciele");
        bazaNazwDruzyn.add("Latający cyrk monty pajtona");
        bazaNazwDruzyn.add("Luzik arbuzik");
        bazaNazwDruzyn.add("Kiść bananów team");
        bazaNazwDruzyn.add("Słoik team");
        bazaNazwDruzyn.add("You shall not pass team");
        bazaNazwDruzyn.add("Dzikie szony");
        bazaNazwDruzyn.add("Gąszcz");
        bazaNazwDruzyn.add("Gostyń team");
    }
    public static int getIloscNazw(){
        return iloscNazw;
    }
    public static String wybierzNazwe(int a){
        String wybranaNazwa = bazaNazwDruzyn.get(a);
        bazaNazwDruzyn.remove(a);
        iloscNazw--;
        return wybranaNazwa;
    }
}
