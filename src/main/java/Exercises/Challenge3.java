package Exercises;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args){
        int x;
        int y;
        int differenceXY;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in two numbers.");

        System.out.print("Enter number: ");
        x = scanner.nextInt();

        System.out.print("Enter number: ");
        y = scanner.nextInt();

        differenceXY = x - y;

        if(x > y){
            System.out.format("%d is greater than %d.\nThe difference is %d.", x, y, differenceXY);
        } else if (x < y) {
            System.out.format("%d is smaller than %d.\nThe difference is %d.", x, y, differenceXY);
        } else if(x == y){
            System.out.format("%d is equal to %d.\nThe difference is %d.", x, y, differenceXY);
        }

    }

}
