public class program2{

    private static int x = 1; // Class variable accessible in whole class

    public static void main(String[] args) {
        int y = 5; // Local variable to main method
        System.out.println("Class variable x " + x);
        System.out.println("Local variable y. " + y);
        someMethod();
    }

    public static void someMethod() {
        System.out.println("Class variable x from someMethod " + x);
        // System.out.println("Local variable y from someMethod " + y); // Error. y cannot be accessed here
    }
}