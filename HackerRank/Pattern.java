import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.println("enter how many rows do you want");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int m=0;m<2*i+1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
        for(int m=0;m<2*(n-i-1)-1 ;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
