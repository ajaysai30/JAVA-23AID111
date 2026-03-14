/*A smartphone stores battery level and brightness settings internally. These values should not be directly accessed by users. Design a class with private variables and provide methods to change brightness and check battery level.*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Phone p=new Phone();
        Scanner obj=new Scanner(System.in);
        System.out.println("BATTERY IS :"+p.getbattery());
        System.out.println("ENTER HOW MUCH BRIGHTNESS DO YOU WANT");
        int brightness=obj.nextInt();
        p.setbrightness(brightness);
        System.out.println("your brightness level is : "+p.getbrightness());
    }
}
class Phone{
    private int battery=54;
    private int brightness;
    int getbattery(){
        return battery;
    }
    int getbrightness(){
        return brightness;
    }
    void setbrightness(int brightness){
        this.brightness=brightness;
    }
}






