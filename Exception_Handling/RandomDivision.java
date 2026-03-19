import java.util.Random;

class Main {
    public static void main(String args[]) {
        int a = 0, b = 0, c = 0,count=0,sum=0;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
                 count++;
            } 
            catch (ArithmeticException e) {
                System.out.println("Division by zero.");
                sum++;
                
                a = 0; 
            }

            System.out.println("a: " + a);
           
        }
         System.out.println("not an errors : "+count);
         System.out.println("errors  : "+sum);
    }
}
