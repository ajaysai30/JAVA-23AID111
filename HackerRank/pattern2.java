import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.println("how many * do you want  ?");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
