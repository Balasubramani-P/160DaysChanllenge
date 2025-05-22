import EXwiTAns.KthsmallElement;
import EXwiTAns.Move_Zeros_End;
import EXwiTAns.Solution;

import java.io.*;
import java.util.*;

import java.util.stream.Collectors;

import static EXwiTAns.Array_Printer.printArray;
import static EXwiTAns.KthsmallElement.kthSmallest1;
import static EXwiTAns.Move_Zeros_End.movetoend;
import static EXwiTAns.RotatedArray.rotateArr;
import static EXwiTAns.RotatedArray.tdrotateArr;
import static EXwiTAns.Solution.getSecondLargest;

public class Main {

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);

            int[] arr ={12,4,8,4,35,34,35,34,35,34,35};
            int[] b={3,6,0,0,5,0,7,10};
//            int ans=getSecondLargest(arr);
//            movetoend(b);
//            //int result= kthSmallest1(3,3,6);
//            System.out.println(" ");
//            System.out.println(ans);
            int[] r={1,2,3,4,5,6};
            rotateArr(r,2);
            printArray(r);


            //System.out.println(ans);
        }
    }