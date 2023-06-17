package src;

public class main {

    public static void main(String[] args) {

        Wyspa wyspa = new Wyspa();
        Grupy grupaA = wyspa.stworzGrupe();
        Grupy grupaB = wyspa.stworzGrupe();

        grupaA.Zagraj1TureMeczuLiny();
        grupaB.Zagraj1TureMeczuLiny();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.Zagraj2TureMeczuLiny();
        grupaB.Zagraj2TureMeczuLiny();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.Zagraj3TureMeczuLiny();
        grupaB.Zagraj3TureMeczuLiny();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.ZagrajPolfinalyMeczuLiny();
        grupaB.ZagrajPolfinalyMeczuLiny();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.ZagrajFinalMeczLiny();
        grupaB.ZagrajFinalMeczLiny();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

    }
}
