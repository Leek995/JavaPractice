package Section6;

import java.util.Scanner;

public class IfElseComplexLogic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("Welcome to SuperFast Rollercoaster!");
        System.out.println("Enter your height in centimeters: ");
        height = sc.nextInt();
        if (height < 130 || height > 210){
            System.out.println("Sorry, you have NOT met the height requirements!");
        }else{
            System.out.println("Height accepted!");
        }

        if (height > 130 && height < 210){
            System.out.println("Height accepted!");
        }else {
            System.out.println("Sorry, you have NOT met the height requirements!");
        }



    }
}
