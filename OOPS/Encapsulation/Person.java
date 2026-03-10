/*Create a class Person with private variables age and name.
Restrict age so it cannot be negative using a setter method.*/
class Person{
    private int age;
    private String name;
    public void setage(int age){
        if (age>=0){
        this.age=age;
        }
        else{
            System.out.println("invalid age");
        }
    }
    public void setname(String name){
        this.name=name;
    }
    public int age(){
        return age;
    }
    public String name(){
        return name;
    }
}
class Main{
    public static void main(String[] args){
        Person obj = new Person();
        obj.setname("ajay");
        obj.setage(10);
        System.out.println("age : "+obj.age());
        System.out.println("name : "+obj.name());
    }
}
