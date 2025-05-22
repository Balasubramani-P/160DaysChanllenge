package EXwiTAns;

import static EXwiTAns.Array_Printer.printArray;

public class Solution {
    public static int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int[] a = arr;
        for (int i = 0; i < n - 1; i++) {
            //swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //swapped = true;
                }
            }
        }
        printArray(arr);
        for(int q=1;q<arr.length;q++){
            if(arr[q]!=arr[0]){
                return arr[q];
            }
        }
        return -1;
    }
}
