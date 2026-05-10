import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int numb=obj.nextInt();
        int rev=0;
        while(numb!=0){
            int temp=numb%10;
            rev=rev*10+temp;
            numb=numb/10;
        }
        System.out.println("reversed number is "+rev);
    }
}
