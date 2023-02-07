package Section7;

public class whileLoops {
    public static void main(String[] args){
        int i = 1;
        while ( i <= 10 ){
            System.out.format("Inside loop: %d.\n" ,i);
            ++i;

        }
        System.out.format("Outside loop: %d\n" ,i);
    }
}
