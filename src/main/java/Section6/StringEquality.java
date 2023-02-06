package Section6;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        String vipPassReply;

        System.out.println("The VIP Lounge");
        System.out.print("Age : ");
        age = sc.nextInt();

        System.out.print("Do you have a VIP Pass yes/no:");
        vipPassReply = sc.next();

        if(age >= 18 && vipPassReply.equals("yes")){
            System.out.println("You're good ");
        }else if(age >= 18 && vipPassReply.equals("no")){
            System.out.println("Get a pass");
        }

    }
}
