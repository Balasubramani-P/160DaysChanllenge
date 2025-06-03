package ThreadExamples;

public class MyRunInterface implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println(i+"john");
            i++;
        }
    }
    public static void main(String[] args){
        MyRunInterface mt=new MyRunInterface();
        Thread t=new Thread(mt);
        t.start();
        int i=0;
        while (i<100){
            System.out.println(i+"Snow");
            i++;
        }
    }
}
