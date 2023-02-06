package Section6;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SuperFast roller coaster");
        System.out.print("What is your height in centimeters: ");
        int height = sc.nextInt();
        if(height < 130){
            System.out.println("Sorry, you are too short.");
        } else if(height > 210){
            System.out.println("Sorry, you are too tall.");
        }else {
            System.out.println("Height accepted. Go ahead");
        }
//        else {
//            System.out.println("You have NOT made the height requirements!");
//        }
//        if(height < 130){
//            System.out.println("You have NOT made the height requirements");
//        }
    }
}
