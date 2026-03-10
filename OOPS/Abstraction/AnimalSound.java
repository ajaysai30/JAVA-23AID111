/*Create an abstract class Animal with abstract method sound().
Create subclasses Dog and Cat.*/
abstract class animal{
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println("boww boww");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meowww");
    }
}
class Main{
    public static void main(String[] args){
       dog a=new dog();
        cat b=new cat();
        a.sound();
        b.sound();
    }
}
