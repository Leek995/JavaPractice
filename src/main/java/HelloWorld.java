public class HelloWorld {
    public static void main(String[] args){
        //System.out.print
        // Similar to a file path dot being like (/) forward slash
        // Could be read as, "In our System find the output in our output print what ever is in the quotations
        // print & println are both methods
        System.out.print("Hello World");
        System.out.print(" & Malik!\n");
        // println doesn't add new line to beginning only the end
        System.out.println("Cat");
        System.out.println("Dog\n");
        System.out.print("Rab\n\tbit\n");
        System.out.println("Ra\bbbi\b\bt");
        // escape characters backslash comes first then character
        System.out.println("The dog said \"Woof\", the rolled around!");
        // double backlashes gives one backlash
        System.out.println("C:\\Users\\bob");

        // known as calling or invoking a method
        hazelnut();
        // main method runs all statements above then terminates before reaches last bracket in main method
    }
    // line 24 is the method header
    public static void hazelnut(){
        // body of method is in between the brackets
        System.out.println("Tree");
        System.out.println("Grass");
    }
}
