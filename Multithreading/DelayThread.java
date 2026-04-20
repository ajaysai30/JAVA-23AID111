class A extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            try{
        Thread.sleep(1000);}
        catch(Exception e){}
        System.out.println(i);
        }
    }
}

class DelayThread{
    public static void main(String[] args){
        A t1 = new A();
        t1.start();
    }
}