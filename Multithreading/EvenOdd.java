class even extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class odd extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        even t1 = new even();
        odd t2 = new odd();
        t1.start();
        t2.start();
    }
}
