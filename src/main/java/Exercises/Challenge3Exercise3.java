package Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge3Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I'm thinking of a number between one and five. What is it?");
        System.out.print("Enter number: ");
        int userNumber = scanner.nextInt();

        if(randomNumber == 1 && userNumber == randomNumber){
            System.out.format("You guessed, %d. That is correct!", randomNumber);
        }else if(randomNumber == 2 && userNumber == randomNumber){
            System.out.format("You guessed, %d. That is correct!", randomNumber);
        }else if(randomNumber == 3 && userNumber == randomNumber){
            System.out.format("You guessed, %d. That is correct!", randomNumber);
        }else if(randomNumber == 4 && userNumber == randomNumber){
            System.out.format("You guessed, %d. That is correct!", randomNumber);
        }else if(randomNumber == 5 && userNumber == randomNumber){
            System.out.format("You guessed, %d. That is correct!", randomNumber);
        }else{
            System.out.println("wrong guess.");;
        }

    }
}
