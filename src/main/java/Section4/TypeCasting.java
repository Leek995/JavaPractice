package Section4;

public class TypeCasting {
    public static void main(String[] args) {

        int foo = 5;

        // implicit type casting
        // Java converts variable into a double before assigning it
        double bar = foo;
        System.out.println(bar);

        // explicit casting;
        double top = 2.78;
        // anything behind the decimal will be chopped for this conversion/casting

        int bottom = (int) top;
        System.out.println(bottom);

        // variable that is being casted original value does not change
        // casting does not modify it creates a new value as a result of the conversion
        System.out.println(top);

        int golf = 4;
        int gti = 90;

        //integers can be casted into a double
        System.out.println((double) gti / golf);

        // be aware of order of operations, answers vary
        System.out.println((double) (gti / golf));
        System.out.println(((double) gti) / golf);

    }
}
