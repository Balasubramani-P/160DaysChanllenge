package ThreadExamples;

public class Test2 extends Thread {

    public void run(){
        int i=0;
        while (i<100){
            System.out.println(i+"john");
            i++;
        }
    }
    public static void main(String[] args){
        Test2 t2=new Test2();
        t2.start();

        int i=0;
        while (i<100){
            System.out.println(i+"Snow");
            i++;
        }
    }
}
