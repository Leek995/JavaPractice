package Section6;

import java.util.Scanner;

public class LexicalScope {
    public static void main(String[] args){
        int numPets = -1;

        if(false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of pets you own: ");
            numPets = scanner.nextInt();
        }
        if (numPets == -1){
            System.out.println("You dont have nay pets");
        }else {
            System.out.println("You have " + numPets + " pets.");
        }

    }
}
