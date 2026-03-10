/*Create an abstract class Vehicle with abstract method start().
Create subclasses Car and Bike implementing the method.*/
abstract class vechile{
    abstract void start();
}
class car extends vechile{
    void start(){
        System.out.println("car is starting...");
    }
}
class bike extends vechile{
    void start(){
        System.out.println("bike is starting...");
    }
}
public class Main{
    public static void main(String[] args){
        car a = new car();
        bike b = new bike();
        a.start();
        b.start();
    }
}
