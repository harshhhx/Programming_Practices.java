// Online Java Compiler
// Use this editor to write, compile and run your Java code online

 public class Exception_andling_Example {

public static void main(String[] args) {

try {

int[] numbers={1, 2, 3};

System.out.println(numbers [5]); // This will throw an ArrayIndexOutOfBoundsException
}
catch (ArrayIndexOutOfBoundsException e) { 

System.out.println("An exception occurred "+e.getMessage());
}
 finally {

System.out.println("The 'try catch is finished");
}
    
}
}