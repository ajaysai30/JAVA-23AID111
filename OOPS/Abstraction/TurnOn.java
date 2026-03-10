/*Create an abstract class Appliance with abstract method turnOn().
Create subclasses Fan and WashingMachine.*/
abstract class Appliance{
    abstract void TurnOn();
}
class fan extends Appliance{
    void TurnOn(){
        System.out.println("FAN IS TURNING ON");
    }
}
class WashingMeachine extends Appliance{
    void TurnOn(){
        System.out.println("Washing meachine is truning on");
    }
}
class Main{
    public static void main(String[] args){
       fan a=new fan();
       WashingMeachine b=new WashingMeachine();
        a.TurnOn();
        b.TurnOn();
    }
}
