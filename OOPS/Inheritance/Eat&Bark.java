/*Create a class Animal with method eat().
Create subclass Dog that adds method bark().*/
class animal{
    void eat(){
        System.out.println(" animal is eating... ");
    }
}
class dog extends animal{
    void bark(){
        System.out.println(" dog is barking...");
    }
}
class Main{
    public static void main(String[] args){
        dog obj=new dog();
        obj.bark();
        obj.eat();
    }
}
