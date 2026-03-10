/*Create a class Shape and subclass Triangle to calculate area*/
class shape{
    double base,height;
}
class triangle extends shape{
    double area(){
        return (0.5)*(base*height);
    }
}
public class Main{
    public static void main(String[] args){
        triangle obj=new triangle();
        obj.base=12.4;
        obj.height=5.6;
        System.out.println("area : "+obj.area());
    }
}
