package EXwiTAns;

import java.util.Arrays;

public class ReverseArray {

    public static void reversetheArray(int[] arr) {


        int[] b = Arrays.stream(arr)
                .boxed()
                .sorted((m, n) -> -1)
                .mapToInt(Integer::intValue)
                .toArray();
        //.forEach(s->System.out.print(s +" "));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}


