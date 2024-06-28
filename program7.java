//Program - 07
class Animal {
    
    public void sound() { 
        System.out.println("Some sound");
        
    }
    }
    
    class Dog extends Animal { 
        @Override public void sound() { 
            System.out.println("Woof");
            }
    }
    
    class Cat extends Animal { 
        @Override public void sound() { 
            System.out.println("Meow");
        }
    }
    
    public class Main {
    
    public static void main(String[] args) { 
        Animal myAnimal =new Animal(); 
        Animal myDog=new Dog();
        Animal myCat=new Cat();
    
        myAnimal.sound(); //Outputs Some sound 
        myDog.sound(); //Outputs Woof 
        myCat.sound(); //Outputs Meow
    
    }
    }