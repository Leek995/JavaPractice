package Exercises;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int userInputAge = scanner.nextInt();
        System.out.format("You've lived %d, and next year if the Lord is willing, you'll be %d.\n" ,userInputAge, userInputAge + 1);
        System.out.println("What is your name?");
        String firstName = scanner.next();
        System.out.format("You have %d characters in your name.",firstName.length());
    }
}
