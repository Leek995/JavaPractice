package Section5;

import java.util.Scanner;

public class ScannerToken {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean b = scanner.nextBoolean();

        //next method only accepts one token at a time
        System.out.println("What is your name?");
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println("You're name is " + firstName + " " + lastName + ".");
        System.out.println("How about your whole name?");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
