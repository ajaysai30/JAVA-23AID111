/*Create an abstract class Employee with abstract method calculateSalary().
Create subclasses FullTimeEmployee and PartTimeEmployee.*/
abstract class Employee{
    abstract void calculateSalary();
}
class partTimeEmp extends Employee{
    void calculateSalary(){
        System.out.println(" part time employee salary is calculated");
    }
}
class fullTimeEmp extends Employee{
    void calculateSalary(){
        System.out.println("full time employee salary is calculated");
    }
}
class Main{
    public static void main(String[] args){
        partTimeEmp a=new partTimeEmp();
        fullTimeEmp b=new fullTimeEmp();
        a.calculateSalary();
        b.calculateSalary();
    }
}
