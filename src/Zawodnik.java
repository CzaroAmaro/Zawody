package src;


public class Zawodnik {
    private String imie = "Dżon";
    private int sila = 50;
    private int refleks = 50;
    private int szybkosc = 50;
    private int celnosc = 50;
    private int wzrost = 50;
    private int waga = 50;
    private int zmeczenie = 0;
    private int jakosc = 2;
    public Zawodnik(String imie, int sila, int refleks, int szybkosc, int celnosc, int wzrost, int waga) {
        if (czyParametryPoprawne(sila, refleks, szybkosc, celnosc, wzrost, waga)) {
            this.imie = imie;
            this.sila = sila;
            this.refleks = refleks;
            this.szybkosc = szybkosc;
            this.celnosc = celnosc;
            this.wzrost = wzrost;
            this.waga = waga;
            obliczJakosc();
        }
        else System.out.println("error"); //nie powinno sie wydarzyc
    }

    public boolean czyParametryPoprawne(int sila, int refleks, int szybkosc, int celnosc, int wzrost, int waga) {
        boolean poprawne = sila > 0 && sila < 101 &&
                refleks > 0 && refleks < 101 &&
                szybkosc > 0 && szybkosc < 101 &&
                celnosc > 0 && celnosc < 101 &&
                wzrost > 150 && wzrost < 250 &&
                waga > 50 && waga < 120;
        return poprawne;
    }

    public void obliczJakosc() {
        int suma = sila + refleks + szybkosc + celnosc;
        if (suma >= 0 && suma < 200)
            jakosc = 1;
        else if (suma >= 200 && suma < 300)
            jakosc = 2;

        else
            jakosc = 3;

    }
    public void zagral(){
        zmeczenie += 20;
    }
    public void przeczekal(){
        zmeczenie -= 20;
    }
    public void addSila(int a){
        sila += a;
    }
    public void addRefleks(int a){
        refleks += a;
    }
    public void addSzybkosc(int a){
        szybkosc += a;
    }
    public void addCelnosc(int a){
        celnosc += a;
    }
    public void addWzrost(int a){
        wzrost += a;
    }
    public void addWaga(int a){
        waga += a;
    }
    public void zmienImie(String a){
        imie = a;
    }
    public String getImie(){
        return imie;
    }
    public int getSila(){
        return sila;
    }
    public int getRefleks(){
        return refleks;
    }
    public int getSzybkosc(){
        return szybkosc;
    }
    public int getCelnosc(){
        return celnosc;
    }
    public int getWzrost(){
        return wzrost;
    }
    public int getWaga(){
        return waga;
    }
    public int getZmeczenie(){
        return zmeczenie;
    }
    public void showStaty(){
        System.out.println("Zawodnik: " + imie);
        System.out.println("Siła: " + sila + "/100");
        System.out.println("Szybkość: " + szybkosc + "/100");
        System.out.println("Refleks: " + refleks + "/100");
        System.out.println("Celność rzutu/strzału: " + celnosc + "/100");
        System.out.println("Wzrost: " + wzrost + "cm");
        System.out.println("Waga: " + waga + "kg");
        System.out.println("Rating: " + jakosc + "/3");
    }

    public String toString (){
        if (jakosc == 1){
            return imie + " *";
        }
        if (jakosc == 2){
            return imie + " **";
        }
        if (jakosc == 3){
            return imie + " ***";
        }
        return imie;
    }
}
