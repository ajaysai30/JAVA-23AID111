/*Create a class Rectangle with private variables length and width.
Provide methods to calculate area and perimeter.*/
class Rectangle{
    private double length;
    private double width;
    public void setlength(double length){
        this.length=length;
    }
    public void setwidth(double width){
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double parameter(){
        return (2*length)+(2*width);
    }
}
class Main{
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        obj.setlength(5);
        obj.setwidth(10);
        System.out.println("area : "+obj.area());
        System.out.println("parameter : "+obj.parameter());
    }
}
