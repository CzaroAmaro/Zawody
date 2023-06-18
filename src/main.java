package src;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Wybierz który turniej chcesz rozegrać:");
        System.out.println("1.Turniej Liny" + "\n" + "2.Turniej Ogni" + "\n" + "3.Turniej Siatkówki");
        Scanner scanner = new Scanner(System.in);

        int wybor = scanner.nextInt();
        scanner.nextLine();
        switch (wybor){
            case 1:
                TurniejLiny.zagrajTurniejLiny();
                break;
            case 2:
                TurniejOgni.zagrajTurniejOgni();
                break;
            case 3:
                TurniejSiatkowki.zagrajTurniejSiatkowki();
                break;
            default:
        System.out.println("Niepoprawna operacja");
        }
    }
}
