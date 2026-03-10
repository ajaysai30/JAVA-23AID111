/*Create class Person with variables name and age.
Create subclass Student with additional variable rollNo*/
class Person{
    int age;
    String name;
}
class student extends Person{
    int rollNo;
}
class Main{
    public static void main(String[] args){
        student obj=new student();
        obj.age=18;
        obj.name="ajay";
        obj.rollNo=54;
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.rollNo);
    }
}
