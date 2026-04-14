class Main {
    public static void main(String[] args) {
        System.out.println("Student details are : ");
        Student obj = new Student("ajay",42);
        obj.display();
        
    }
}
class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public void display(){
        System.out.println("name : "+ name);
        System.out.println("marks: "+marks);
    }
}