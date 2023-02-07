package Section7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhileLoop {
    public static void main(String[] args){
        int i = 0;

        do{
            i++;
            System.out.println(i);
        }while(i < 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to roll a dice?");
        String playAgain;
        do{
            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a " + num + ".");
            System.out.println("Would you like to roll again? (y/n)");
            playAgain = sc.nextLine();
        }while(!playAgain.equals("n"));
    }

}
