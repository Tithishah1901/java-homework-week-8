package methodoverriding23;

public class Bike2 extends Vehicle {
    // creating a child class
    // Defining the same method as in parent class
    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();// calling method
    }
}
