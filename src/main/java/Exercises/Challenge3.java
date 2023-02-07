package Exercises;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in two numbers.");

        System.out.print("Enter number: ");
        x = scanner.nextInt();

        System.out.print("Enter number: ");
        y= scanner.nextInt();

        if(x > y){
            System.out.format("%d is greater than %d", x, y);
        } else if (x < y) {
            System.out.format("%d is smaller than %d", x, y);
        } else if(x == y){
            System.out.format("%d is equal to %d", x, y);
        }

    }

}
