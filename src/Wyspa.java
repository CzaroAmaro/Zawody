package src;

public class Wyspa {
  private static ArrayList<Druzyna> listaDruzyn = new ArrayList<>();
    private int iloscDruzyn = 0;
    public void dodajDruzyne(Druzyna a){
        listaDruzyn.add(a);
        iloscDruzyn += 1;
    }
    public Druzyna gerDruzyna(int a){
        return listaDruzyn.get(a);
    }
    public int getIlosc(){
        return iloscDruzyn;
    }
    public void wyswietlDruzyny(){
        for (int i=0; i<iloscDruzyn; i++){
            listaDruzyn.get(i).toString();
        }
    }
}
