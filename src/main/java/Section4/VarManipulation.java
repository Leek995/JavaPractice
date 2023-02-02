package Section4;

public class VarManipulation {
    public static void main(String[] args){
        int x = 15;
        System.out.println(x);
        // x cannot be assigned a different data type once it is already declared
        x = 32;
        System.out.println(x);
        x = -1000;
        System.out.println(x);
        int a = 2;
        int b = 5;
        // a gets assigned after whatever on the right is finished
        a = a + b + a;
        System.out.println(a);
        System.out.println(15.0/7);
    }
}
