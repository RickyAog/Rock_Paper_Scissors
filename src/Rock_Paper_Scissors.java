
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("________________________________________");
        System.out.println("|Welcome Roshambo                      |");
        System.out.println("|Ro is Rock Sham is paper Bo is scissor|");
        System.out.println("|Type what you would like to play      |");
        System.out.println("________________________________________");

        Scanner keyboard = new Scanner(System.in);
        for (int rsbCPU=rsbCPU();rsbCPU<7;rsbCPU++) {
            rsbPlayer(keyboard);
            rsbCPU();
            rsbTie(keyboard);
            rsbCPUWinner(keyboard);
            rsbPlayerWinner(keyboard);
        }
    }


    public static int rsbPlayer(Scanner keyboard) {
        int Ro =0;
        int Sham=1;
        int bo=2;
        String rsbPlayer;
        rsbPlayer = keyboard.nextLine().toUpperCase();
        if (rsbPlayer == "RO") {
            System.out.println("You pick RO");
        }
        if (rsbPlayer == "SHAM") {
            System.out.println("You pick SHAM");
        }
        if (rsbPlayer == "BO") {
            System.out.println("You pick BO");
        }
        return 2;
    }


    public static int rsbCPU() {
        int rsbCPU = (int) (Math.random() * 100 / 50);
        if (rsbCPU == 0) {
            System.out.println("The CPU picked RO");
        }
        if (rsbCPU == 1) {
            System.out.println("The CPU picked SHAM");
        }
        if (rsbCPU == 2) {
            System.out.println("The CPU picked SHAM");
            }


        return 2;
    }

    public static int rsbTie(Scanner keyboard){
        if (rsbPlayer(keyboard) == rsbCPU()) {
        System.out.println("You tied");

        }
        return 2;
    }
    public static int rsbPlayerWinner(Scanner keyboard) {

        //RSBPLAYER WINS
        if (rsbPlayer(keyboard) > rsbCPU()) {
            System.out.println("You win");

        }
        return 2;
    }

    public static int rsbCPUWinner(Scanner keyboard) {
        if (rsbCPU() > rsbPlayer(keyboard)) {
            System.out.println("You lose");

        }

        return 2;

    }
}