package src;

public class TurniejOgni extends Grupy {

    public static void zagrajTurniejOgni() {
        Wyspa wyspa = new Wyspa();
        Grupy grupaA = wyspa.stworzGrupe();
        Grupy grupaB = wyspa.stworzGrupe();

        grupaA.Zagraj1TureMeczuOgni();
        grupaB.Zagraj1TureMeczuOgni();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.Zagraj2TureMeczuOgni();
        grupaB.Zagraj2TureMeczuOgni();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.Zagraj3TureMeczuOgni();
        grupaB.Zagraj3TureMeczuOgni();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);


        Druzyna druzyna1ZGrupyA = grupaA.zwrocNajlepszaDruzyne();
        Druzyna druzyna2ZGrupyA = grupaA.zwrocNajlepszaDruzyne();

        Druzyna druzyna1ZGrupyB = grupaB.zwrocNajlepszaDruzyne();
        Druzyna druzyna2ZGrupyB = grupaB.zwrocNajlepszaDruzyne();

        System.out.println("\n\n\n");

        Grupy polfinaloweIFinalowe = new Grupy();

        Druzyna finalowa1 = polfinaloweIFinalowe.ZagrajPolfinalyMeczuOgni(druzyna1ZGrupyA, druzyna2ZGrupyB);
        Druzyna finalowa2 = polfinaloweIFinalowe.ZagrajPolfinalyMeczuOgni(druzyna2ZGrupyA, druzyna1ZGrupyB);

        System.out.println("\n\n\n");

        polfinaloweIFinalowe.ZagrajFinalMeczLiny(finalowa1, finalowa2);
    }
}
