package Section5;
import java.util.Scanner;

public class ScannerInputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        // .nextLine method is known as a blocker. It stops the progression of the program until satisfied.
        String name = scanner.nextLine();
        System.out.println(name + " is a nice name!");
        System.out.println("\nHow old are you, " + name + "?");
        int age = scanner.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + "years old.");
        System.out.println("\nHow tall are you in meters?");
        double height = scanner.nextDouble();
        System.out.println("You are " + height + " meters tall.");
    }
}
