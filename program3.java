// Program - 03
public class Car {

    // Fields (attributes)
    private String color;
    private String model;
    
    //Constructor
    public Car(String color, String model) {
    
    this.color=color;
    this.model= model;
    }
    
    //Method
    public void displayInfo() {
    
    System.out.println("Car model: "+model+"\nColor: "+color); 
        
    }
    
    // Main method to create and use objects of Car class
    public static void main(String[] args) {
    
    Car myCar = new Car("Red", "Toyota Corolla");
    
    myCar.displayInfo();
    
    }
    
    }