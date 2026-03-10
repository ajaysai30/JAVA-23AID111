/*Create an abstract class Shape with an abstract method area().
Create subclasses Circle and Rectangle to implement it*/
abstract class Shape{
    abstract double area();
}
class circle extends Shape{
    double radius;
     circle(double radius){
        this.radius=radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
class rectangle extends Shape{
    double length,width;
    rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }
    
}
class Main{
    public static void main(String[] args){
        circle a= new circle(5.0);
        rectangle b= new rectangle(12.5,5.0);
        System.out.println("area of circle is "+a.area());
        System.out.println("area of rectangle is "+ b.area());
    }
}
