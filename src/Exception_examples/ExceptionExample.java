package Exception_examples;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //normal exception
       /* System.out.println("Enter the values of a and b: ");
        int a= sc.nextInt();
        int b=sc.nextInt();

        try {
            int c=a/b;
            System.out.println("The division of two numbers are: "+c);
        }catch (ArithmeticException i){
            System.out.println(i);
        }
        int mul=a*b;
        System.out.println("Multiplay of two Num: "+mul);*/


//----------Multiple try catch example------------
        int A[]={30,20,10,40,0};

        try
        {
            int c=A[0]/A[1];
            System.out.println("Division is "+c);

            try
            {
                System.out.println(A[2]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index is Invalid");
            }

        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }


        System.out.println("Bye");

    }
}
