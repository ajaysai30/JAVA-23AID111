import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        int fact=1;
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+n+" is "+ fact);
    }
}
