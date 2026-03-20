/*1.Write a Java program to store your age and print whether you are eligible to vote */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE  ");
        int age=obj.nextInt();
        if (age>=18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
    }
}
/*2.Write a program to check whether a number is positive, negative, or zero*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int a=obj.nextInt();
        if (a>0){
            System.out.println("number is positive");
        }
        else if (a<0){
            System.out.println("number is negitive");
        }
        else{
            System.out.println("number is zero");
        }
    }
}
/*3.A shop gives a discount if the bill amount is more than ₹1000. Write a Java program to check whether discount is applicable*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER YOUR BILL ");
        int bill=obj.nextInt();
        if (bill>1000){
            System.out.println("DISCOUNT IS APPLICABLE");
        }
        else{
            int amount=1000-bill;
            System.out.println("DISCOUNT IS NOT APPLICABLE");
            System.out.println("DO "+amount+" more bill AMOUNT for discount");
        }
        
    }
}
/*4.Write a Java program to check whether a given year is a leap year or not. Explain the logic using conditions.*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER WHICH YEAR DO YOU WANT TO CHECK : ");
        int year=obj.nextInt();
        if (year%2==0){
            System.out.println("leap yaer");
        }
        else{
            System.out.println("not a leap year");
        }
        
    }
}
/*5.Write a program to find the greatest among three numbers using logical operators*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER 3 NUMBERS : ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if (b>a && b>c){
            System.out.println(b+" is greater ");
        }
        else{
            System.out.println(c+" is greater ");
        }
        
    }
}
/*6.Write a program to count how many numbers between 1 and 100 are divisible by 5.*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int count=0;
        for(int i=1;i<=100;i++){
            if (i%5==0){
                count++;
            }
        }
       System.out.println("numbers between 1 and 100 are divisible by 5 are "+count);
    }
}
/*7.Given a number, find the sum of all even numbers from 1 to that number.*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int sum=0,n=obj.nextInt();
        for(int i=1;i<=n;i++){
            if (i%2==0){
                sum+=i;
            }
        }
       System.out.println("sum of even numbers form 1 to"+n+" " +sum);
    }
}
