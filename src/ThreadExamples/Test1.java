package ThreadExamples;

class Mytest extends Thread{

    public void run(){
        int i=0;
        while (i<100){
            System.out.println(i+"Thread is running");
            i++;
        }
    }
}

public class Test1{
    public static void main(String[] args){
        Mytest m=new Mytest();
        m.start();

        int i=0;
        while (i<100){
            System.out.println(i+"java");
            i++;
        }
    }
}