package src;

public class TurniejLiny extends Grupy {
    public static void zagrajTurniejLiny() {
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


        Druzyna druzyna1ZGrupyA = grupaA.zwrocNajlepszaDruzyne();
        Druzyna druzyna2ZGrupyA = grupaA.zwrocNajlepszaDruzyne();

        Druzyna druzyna1ZGrupyB = grupaB.zwrocNajlepszaDruzyne();
        Druzyna druzyna2ZGrupyB = grupaB.zwrocNajlepszaDruzyne();

        System.out.println("\n\n\n");

        Grupy polfinałoweIFinalowe = new Grupy();

        Druzyna finalowa1 = polfinałoweIFinalowe.ZagrajPolfinalyMeczuLiny(druzyna1ZGrupyA, druzyna2ZGrupyB);
        Druzyna finalowa2 = polfinałoweIFinalowe.ZagrajPolfinalyMeczuLiny(druzyna2ZGrupyA, druzyna1ZGrupyB);

        System.out.println("\n\n\n");

        polfinałoweIFinalowe.ZagrajFinalMeczOgni(finalowa1, finalowa2);
    }
}
