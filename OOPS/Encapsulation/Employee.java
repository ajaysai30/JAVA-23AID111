/*. Create a class Employee with private variables id, name, and salary.
Use getters and setters and display employee details.*/
class Employee{
    private int id;
    private String name;
    private double salary;
    
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public double getsalary(){
        return salary;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    
}
class Main{
    public static void main(String[] args){
        Employee obj=new Employee();
        System.out.println("Student details are : ");
        obj.setid(25054);
        obj.setname("ajay");
        obj.setsalary(120000.0);
        System.out.println("id : "+obj.getid());
        System.out.println("name : "+obj.getname());
        System.out.println("salary : "+obj.getsalary());
    }
}
