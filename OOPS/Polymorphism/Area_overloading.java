/*Create overloaded method area() for:

Circle

Rectangle*/
class Shape{
    double area(double radius){
        return 3.14*radius*radius;
    }
    double area(double length,double width){
        return length*width;
    }
}
class Main{
    public static void main(String[] args){
     Shape obj = new Shape();
    System.out.println("area of circle " + obj.area(5.0));
    System.out.println("area of rectangle "+ obj.area(5.0,7.5));
    }
}
