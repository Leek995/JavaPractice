package Section6;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        String vipPassReply;

        System.out.println("The VIP Lounge");
        System.out.print("Age : ");
        age = sc.nextInt();



        if(age >= 18){
            System.out.print("Do you have a VIP Pass yes/no:");
            vipPassReply = sc.next();

            if(vipPassReply.equals("yes") || age >= 70){
                System.out.println("Thanks, go in.");
            }else{
                System.out.println("Sorry, get a pass");
            }
        }else {
            System.out.println("Scram get out of here!");
        }
    }
}
