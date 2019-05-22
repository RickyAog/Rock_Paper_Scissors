
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("________________________________________");
        System.out.println("|Welcome Ro-sham-bo                    |");
        System.out.println("|0 is Rock, 1 is paper, 2 is scissor   |");
        System.out.println("|Type what you would like to play      |");
        System.out.println("________________________________________");

        Scanner keyboard = new Scanner(System.in);
        for (int rsbPlayer=rsbPlayer(keyboard);rsbPlayer<5;rsbPlayer++) {
            startGame(keyboard);
        }
    }



    public static int rsbPlayer(Scanner keyboard) {
        int rsbPlayer;
        rsbPlayer = Integer.parseInt(keyboard.nextLine().toUpperCase());
        if (rsbPlayer == 0) {
            System.out.println("You pick ROCK");
        }
        if (rsbPlayer == 1) {
            System.out.println("You pick PAPER");
        }
        if (rsbPlayer == 2) {
            System.out.println("You pick SCISSOR");
        }
        return 2;
    }


    public static int rsbCPU() {
        int rsbCPU = (int) (Math.random() * 100 / 50);
        if (rsbCPU == 0) {
            System.out.println("The CPU picked ROCK");
        }
        if (rsbCPU == 1) {
            System.out.println("The CPU picked PAPER");
        }
        if (rsbCPU == 2) {
            System.out.println("The CPU picked SCISSOR");
            }


        return 2;
    }

    public static int rsbTie(Scanner keyboard){
        if (rsbPlayer(keyboard) == rsbCPU()) {
        System.out.println("You tied");
System.out.println("+0 point");
        }
        return 2;
    }
    public static int rsbPlayerWinner(Scanner keyboard) {

        if (rsbPlayer(keyboard) != rsbCPU()) {
            System.out.println("You win");
System.out.println("+ 1 for you");
        }
        return 2;
    }

    public static int rsbCPUWinner(Scanner keyboard) {
        if (rsbCPU() != rsbPlayer(keyboard)) {
            System.out.println("You lose");
System.out.println("+ 1 point for the cpu");
        }

        return 2;

    }
    public static int startGame(Scanner keyboard) {
        rsbPlayer(keyboard);
        rsbCPU();
        if (rsbPlayer(keyboard) == rsbCPU()) {
            rsbTie(keyboard);
        }
        if (rsbPlayer(keyboard) == 0) if (rsbCPU() == 2) {

        }
        {
            rsbPlayerWinner(keyboard);
        }
        if (rsbPlayer(keyboard) == 1) if (rsbCPU() == 0) {

        }
        {
            rsbPlayerWinner(keyboard);
        }
        if (rsbCPU() == 2) if (rsbPlayer(keyboard) == 1) {

        }
        {
            rsbCPUWinner(keyboard);
        }
        if (rsbCPU() == 0) if (rsbPlayer(keyboard) == 2) {

        }
        {
            rsbCPUWinner(keyboard);
        }
        if (rsbCPU() == 1) if (rsbPlayer(keyboard) == 0) {

        }
        {
            rsbCPUWinner(keyboard);
        }
        if (rsbCPU() == 2) if (rsbPlayer(keyboard) == 1) {

        }
        {
            rsbCPUWinner(keyboard);
        }





    return 0;
    }

}
