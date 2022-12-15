import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello friend!");
        Scanner sc = new Scanner(System.in);
//        String[] str = new String[]{"rock","paper","scissors"};
        boolean n = true;
        while (n){
            System.out.println("Do you wanna play?");
            String play = sc.nextLine();
            int computer;
            int human;
            if(play.equals("yes")|| play.equals("Yes") || play.equals("YES")){
                computer = rewriter();
                human = choosing();
                System.out.println(computer + " = comp || your = " + human);
                winner(human,computer);
                System.out.println("Play again?");
                String again = sc.nextLine();
                if(again.equals("yes")|| again.equals("Yes") || again.equals("YES")){
                }
                else{
                    n = false;
                }

            }
            else{
                n = false;
            }
        }


    }
    private static int rewriter(){
        Random rd = new Random();
        int computer = rd.nextInt(1,3);
//        if(num == 0) step = "rock";
//        else if(num==1) step = "paper";
//        else step = "scissors";
//        return step;
        return computer;
    }
    private static int choosing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your variant :");
        System.out.println("1. rock");
        System.out.println("2. paper");
        System.out.println("3. scissors");
        int human = sc.nextInt();
        return human;
    }
    private static void winner(int human, int computer){
        if((human == 1 && computer == 3) || (human == 2 && computer == 1) || (human == 3 && computer ==2)){
            System.out.println("You WIN!");
        }
        else if((human == 3 && computer == 1) || (human == 1 && computer == 2) || (human == 2 && computer ==3)){
            System.out.println("You LOSE!");
        }
        else{
            System.out.println("DRAW!");
        }
    }

}