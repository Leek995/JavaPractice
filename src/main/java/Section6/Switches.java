package Section6;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num){
            // input after case is the parameter
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two.");
                break;
            case 3:
                System.out.println("You entered three.");
                break;
                // default acts as a catch-all if all other cases are false, similar to a else block
            default:
                System.out.println("Invalid number.");
                break;
        }

        // using if/else-if/else to accomplish the same as a switch
        if(num == 1){
            System.out.println("You entered one.");
        } else if(num == 2){
            System.out.println("You entered two.");
        } else {
            System.out.println("Invalid number.");
        }

    }
}
