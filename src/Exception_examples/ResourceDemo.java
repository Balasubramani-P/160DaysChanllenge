package Exception_examples;
import java.io.*;
import java.util.*;
public class ResourceDemo {
    static void Divide() throws Exception
    {


        try(FileInputStream fi=new FileInputStream("C:/Users/Balasubramani/Downloads/JavaExWithSol/ProblemWithSolution/My.txt");Scanner sc=new Scanner(fi) )
        {//C:\UsersBalasubramaniDownloadsJavaExWithSolProblemWithSolutionmy\My.txt
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }

    }

    public static void main(String[] args) throws Exception
    {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        //int x=sc.nextInt();

        // System.out.println(x);

    }

}