import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("________________________________________");
        System.out.println("|Welcome Roshambo                      |");
        System.out.println("|Ro is Rock Sham is paper Bo is scissor|");
        System.out.println("________________________________________");
        System.out.println("Type what you would like to play");
        for (int rsbPlayer = 0; rsbPlayer < 7; rsbPlayer++) {
            rsbPlayer();
            rsbCPU();
            rsbPlayerWinner();
            rsbCPUWinner();
        }
    }

    public static String rsbPlayer() {
        Scanner keyboard = new Scanner(System.in);
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
        return "You picked " + rsbPlayer;
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
            System.out.println("The CPu picked SHAM");
        }
        return 2;
    }

    public static String rsbPlayerWinner() {
        //TIED
        if (rsbPlayer() == "RO") while (rsbCPU() == 0) {
            System.out.println("You tied");
        }
        if (rsbPlayer() == "SHAM") while (rsbCPU() == 1) {
            System.out.println("You tied");
        }
        if (rsbPlayer() == "BO") while (rsbCPU() == 2) {
            System.out.println("You tied");
        }
        //RSBPLAYER WINS
        if (rsbPlayer() == "RO") while (rsbCPU() == 2) {
            System.out.println("YOU WIN");
        }
        if (rsbPlayer() == "SHAM") while (rsbCPU() == 0) {
            System.out.println("YOU WIN");
        }
        if (rsbPlayer() == "BO") while (rsbCPU() == 1) {
            System.out.println("YOU WIN");
        }
        return "Pick another ro,sham or bo";
    }

    public static String rsbCPUWinner() {
        if (rsbCPU() == 0) while (rsbPlayer() == "BO") {
            System.out.println("You lose");
        }
        if (rsbCPU() == 1) while (rsbPlayer() == "RO") {
            System.out.println("You lose");
        }
        if (rsbCPU() == 2) while (rsbPlayer() == "SHAM") {
            System.out.println("You lose");
        }
        return "pick another Ro,Sham,Bo";
    }
}