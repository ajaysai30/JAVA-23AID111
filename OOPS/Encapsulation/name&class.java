/*Q1. Create a class Student with private variables name and marks.
Use getter and setter methods to access and modify the values. Print the student details.*/
class Student{
    private String name;
    public int _class;
    String getname(){
        return name;
    }
    int get_class(){
        return _class;
    }
    void setname(String name){
        this.name=name;
    }
    void set_class(int _class){
        this._class=_class;
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("Student details are: ");
        Student obj=new Student();
        obj.setname("ajay");
        obj.set_class(12);
        System.out.println("name: "+obj.getname());
        System.out.println("class: "+obj.get_class());
    }
}
