//Program - 09

class Car {
    private String model; 
    private int year;
    
    //Constructor
    public Car (String model, int year) {
        
    this.model =model;
    this.year=year;
    }
    
    public void displayInfo() {
            System.out.println("Model: "+model+"\nYear: "+year);
        }
    }
    
    public class Main {
    public static void main(String[] args) {
    
    Car car1 = new Car ("Toyota Corolla", 2020);
    car1.displayInfo();
    }
    }