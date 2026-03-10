/*Create class Vehicle with method run().
Override it in subclasses Bike and Car*/
class vechile{
    void run(){
        System.out.println("vechile is running");
    }
}
class bike extends vechile{
    void run(){
        System.out.println("bike is running");
    }
}
class car extends vechile{
    void run(){
        System.out.println("car is running");
    }
}
class Main{
    public static void main(String[] args){
        bike a=new bike();
        car b=new car();
        a.run();
        b.run();
    }
}
