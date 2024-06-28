// Program - 04
public class TypeCasting {

    public static void main(String[] args) {
    
    //Implicit casting (automatic type conversion)
    int mylnt =9;
    double myDouble=mylnt;
    
    System.out.println("Int value: "+mylnt);
    System.out.println("Converted to double: "+myDouble);
    
    //Explicit casting (manual type conversion) 
    double anotherDouble = 9.78;
    int anotherint = (int) anotherDouble;
    
    System.out.println("Double value: " + anotherDouble);
    System.out.println("Converted to int: " + anotherint);
    
    }
    
    }