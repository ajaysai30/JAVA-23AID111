/*Create a class MathOperations with overloaded methods add()

add(int a, int b)

add(int a, int b, int c)*/
class MathOperations{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class Main{
    public static void main(String[] args){
     MathOperations obj = new MathOperations();
    System.out.println("a+b= "+ obj.add(5,5));
    System.out.println("a+b+c= "+ obj.add(5,5,5));
    }
}
