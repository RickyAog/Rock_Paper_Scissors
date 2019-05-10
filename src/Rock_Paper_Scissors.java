import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("________________________________________");
        System.out.println("|Welcome Roshambo                      |");
        System.out.println("|Ro is Rock Sham is paper Bo is scissor|");
        System.out.println("________________________________________");

        System.out.println("Type what you would like to play");
       for(int rsbPlayer=0; rsbPlayer<7; rsbPlayer++){
           rsbPlayer();
           rsbCPU();
           rsbPlayerWinner();
       }

    }
    public static String rsbPlayer(){
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
    public static String rsbCPU(){




        return"Who is gonna win";
    }
public static String rsbPlayerWinner(){
        if(rsbPlayer() == rsbCPU() ){
            System.out.println("You tied");
        }
        if (rsbPlayer()=="RO") (rsbCPU()== "BO") {
            System.out.println("YOU WIN");
    }
    if(rsbPlayer()=="SHAM")(rsbCPU()== "RO"){
            System.out.println("YOU WIN");
    }
    if(rsbPlayer()=="BO")(rsbCPU()=="SHAM"){
            System.out.println("YOU WIN");
    }


        return"Pick another ro,sham or bo";
    }
    public static String rsbCPUWinner(){
        if(rsbCPU()=="RO")(rsbPlayer()=="BO"){
            System.out.println("You lose");
        }
        if(rsbCPU()=="SHAM")(rsbPlayer()== "RO"){
            System.out.println("You lose");
        }

        return "pick another Ro,Sham,Bo";
    }
}



