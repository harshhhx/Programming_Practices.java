// Base class (parent) 
class Vehicle { 

    //Vehicle attribute
    protected String brand="Ford";
    
    //Vehicle method 
    public void honk() {
    System.out.println("Tuut, tuut!");
    }
    }
    
    // Derived class (child)
    class Car extends Vehicle { 
        
    // Car attribute
    private String modelName="Mustang";
    
    public void displayModel() { 
        System.out.println("Brand : "+brand+"\nModel: "+modelName);
        }
    }
    
    public class Main {
    public static void main(String[] args) 
    { 
        Car myCar = new Car(); 
        myCar.honk(); 
        myCar.displayModel();
    }
    }