//Program - 08

class AccessSpecifierDemo {

    public int publicVar=100; //Accessible for many other class

    private int privateVar=200; // Accessible only within the class

    protected int protectedVar=300; // Accessible within the class and by derived classes

    public void display() {
        System.out.println("Public" + publicVar);
        System.out.println("Private: "+privateVar);
        System.out.println("Protected "+protectedVar);
    }
}

public class Main {
public static void main(String[] args) {

AccessSpecifierDemo demo = new AccessSpecifierDemo();
demo.display();

System.out.println(demo.publicVar);
//Systemout.println(demma,privateVar); //Error: Cannot access
// Systemout.println(demaprotectedVar); //Error: Cannot access outside the class without inheritance
}
}