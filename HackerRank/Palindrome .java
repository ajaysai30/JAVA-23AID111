import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int numb=obj.nextInt();
        int orig=numb;
        int rev=0;
        while(numb!=0){
            int temp=numb%10;
            rev=rev*10+temp;
            numb=numb/10;
        }
        int palin=rev;
        if(orig==palin){
            System.out.println("its a palindrom series");
        }
        else{
            System.out.println("its not a palindrom");
        }
    }
}
