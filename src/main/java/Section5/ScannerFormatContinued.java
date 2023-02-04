package Section5;

import java.util.Scanner;

public class ScannerFormatContinued {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height?");
        double userHeight = scanner.nextDouble();
        double averageHeight = 1.75;
        double results = userHeight - averageHeight;
        System.out.format("Your height is, %.1f. The average height is %s. The difference is %.1f.", userHeight, averageHeight, results);

    }
}
