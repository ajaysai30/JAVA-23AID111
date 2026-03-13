/*An ATM system stores customer details such as PIN number and account balance. 
These details must not be accessed directly. Create a class that keeps these variables private and provide methods to check balance, deposit money,
and withdraw money securely.*/
import java.util.*;
class BankDetails{
    private int pin;
    private double balance;
     
    int getpin(){
        return pin;
    }
    void setpin(int pin){
        this.pin=pin;
    }
    double getbalance(){
        return balance;
    }
    /*void setbalance(double balance){
        this.balance=balance;
    }*/
    double deposite(double amount){
        this.balance+=amount;
        return this.balance;
    }
    double withdraw(double amount){
        this.balance-=amount;
        return this.balance;
    }
}
class Main{
    public static void main(String[] args){
        double money=0;
        Scanner obj=new Scanner(System.in);
         BankDetails s = new  BankDetails();
        System.out.println("ENTER YOUR PIN");
        int pin=obj.nextInt();
    if(pin==5454){
        s.setpin(pin);
        System.out.println("ENTER YOUR CHOICE ");
        System.out.println("__________________________");
        System.out.println("1 check balance");
        System.out.println("2 deposite  ");
        System.out.println("3 withdraw");
        System.out.println("4 exit");
        System.out.println("__________________________");
        int c=obj.nextInt();
        switch(c){
            case 1:
                System.out.println("BALANCE: "+s.getbalance());
                break;
            case 2:
                System.out.println("ENTER DEPOSITE MONEY: ");
                money=obj.nextDouble();
                System.out.println("balance after deposite is : "+s.deposite(money));
                break;
            case 3:
                System.out.println("ENTER WITHDRAW MONEY");
                money=obj.nextDouble();
                System.out.println("balance after deposite : "+s.withdraw(money));
                break;
            case 4:
                break;  
        }
    }
        else{
            System.out.println("invalid pin try again");
        }
    }
}









