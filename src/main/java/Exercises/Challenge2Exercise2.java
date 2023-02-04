package Exercises;

import java.util.Scanner;

public class Challenge2Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double tabTotal;
        int totalPeople;
        System.out.println("What is the total of the tab?");
        tabTotal = sc.nextDouble();
        System.out.println("How many people are splitting the bill?");
        totalPeople = sc.nextInt();
        System.out.format("You're looking at about... %.2f per person.",tabTotal/totalPeople);
    }
}
