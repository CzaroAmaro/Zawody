package src;

public class TurniejSiatkowki extends Grupy {

    public static void zagrajTurniejSiatkowki() {
        Wyspa wyspa = new Wyspa();
        Grupy grupaA = wyspa.stworzGrupe();
        Grupy grupaB = wyspa.stworzGrupe();

        grupaA.Zagraj1TureMeczuSiatkowki();
        grupaB.Zagraj1TureMeczuSiatkowki();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.Zagraj2TureMeczuSiatkowki();
        grupaB.Zagraj2TureMeczuSiatkowki();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);

        grupaA.Zagraj3TureMeczuSiatkowki();
        grupaB.Zagraj3TureMeczuSiatkowki();

        wyspa.wyswietlGrupy(grupaA, grupaB, wyspa);


        Druzyna druzyna1ZGrupyA = grupaA.zwrocNajlepszaDruzyne();
        Druzyna druzyna2ZGrupyA = grupaA.zwrocNajlepszaDruzyne();

        Druzyna druzyna1ZGrupyB = grupaB.zwrocNajlepszaDruzyne();
        Druzyna druzyna2ZGrupyB = grupaB.zwrocNajlepszaDruzyne();

        System.out.println("\n\n\n");

        Grupy polfinaloweIFinalowe = new Grupy();

        Druzyna finalowa1 = polfinaloweIFinalowe.ZagrajPolfinalyMeczuSiatkowki(druzyna1ZGrupyA, druzyna2ZGrupyB);
        Druzyna finalowa2 = polfinaloweIFinalowe.ZagrajPolfinalyMeczuSiatkowki(druzyna2ZGrupyA, druzyna1ZGrupyB);

        System.out.println("\n\n\n");

        polfinaloweIFinalowe.ZagrajFinalMeczSiatkowki(finalowa1, finalowa2);
    }
}
