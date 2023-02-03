package Section5;

import java.util.Scanner;

public class ScannerFormat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(4.5 - 2.7);
        System.out.format("when formatted: %.1f\n", 4.5-2.7);
        //format works similar to print, but allows you to format output
        // format doesn't add new line
        System.out.format("whatever\n");
        // supply output method of print with two args
        System.out.format("I have %d dog", 2);
        System.out.format("I have %d dog(s), %d cats, and 1 %s", 2, 0, "brother.");

        // you can round float decimal points by formatting
        // include amount of decimals in between the percent and float type, like so %.3f
        System.out.format("I have %.1f bugs(s), %.2f cars, and 1 %s", 2.1, 3.4456, "coffee.");
    }
}
