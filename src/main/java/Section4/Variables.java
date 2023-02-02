package Section4;

public class Variables {
    public static void main(String[] args){
        int x = 10;
        String stringedX = "10";
        // Something to note output to the console doesn't distinguish String from integer
        System.out.println(x);
        System.out.println("10");
        System.out.println(stringedX);

        // (+ - / *) are all operators
        // (=)equal sign in java is called the assignment operator bc is assigns value on right to variable on left
        // always does what's on the right, then the assignment happens.
        int guitar = 20 / 10;
        System.out.println(guitar + 5);

        // order of operation same as math PEDMAS
        int bike = 20 / 4 - 2;
    }
}
