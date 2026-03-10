/*Create class Vehicle with method display().
Create subclass Car with method speed()*/
class vechile{
    void display(){
        System.out.println("Displaing vechile..");
    }
}
class car extends vechile{
    void speed(){
        System.out.println(" car speed is ");
    }
}
public class Main{
    public static void main(String[] args){
        car obj=new car();
        obj.speed();
        obj.display();
    }
}
