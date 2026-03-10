/* Create a class BankAccount with private variables accountNumber and balance.
Provide methods deposit() and withdraw().
*/
class BankAccount{
    private int AccountNumber;
    private double Balance;
    int getAccountNumber(){
        return AccountNumber;
    }
    double getBalance(){
        return Balance;
    }
    void setAccountNumber(int AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    void setBalance(double Balance){
        this.Balance=Balance;
    }
    public void Deposite(double amount){
        this.Balance=amount+Balance;
    }
    public void Withdraw(double amount){
        if(amount>Balance){
            System.out.println("insufficent balance");
        }
        else{
            this.Balance=Balance-amount;
        }
    }
}
public class Main{
    public static void main(String[] args){
        BankAccount obj= new BankAccount();
        obj.setAccountNumber(25054);
        System.out.println("account number : "+obj.getAccountNumber());
        obj.setBalance(500.0);
        System.out.println("balance: "+obj.getBalance());
        obj.Deposite(100);
        System.out.println("after deposite balance  : "+obj.getBalance());
        obj.Withdraw(200);
        System.out.println("after withdraew: "+obj.getBalance());
        
    }
}
