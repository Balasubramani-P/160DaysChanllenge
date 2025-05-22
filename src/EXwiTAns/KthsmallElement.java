package EXwiTAns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static EXwiTAns.Array_Printer.printArray;

public class KthsmallElement {

   public static int kthSmallest1(int m, int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Try all combinations
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr.add(i * j);
            }
        }

        // Sort the array
        Collections.sort(arr);
       System.out.println(arr);

        return arr.get(k - 1);
    }

    public int kthSmallest(int m, int n, int k) {
        // code here
        int[][] mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=(i+1)*(j+1);
            }
        }
        int rows = mat.length;
        int cols = mat[0].length;
        int[] oneDArray = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = mat[i][j];
            }
        }
        Arrays.sort(oneDArray);
        printArray(oneDArray);


        return oneDArray[k-1];
    }
}
