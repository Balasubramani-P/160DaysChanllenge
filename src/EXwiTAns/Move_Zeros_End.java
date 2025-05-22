package EXwiTAns;

public class Move_Zeros_End {
     public static void movetoend(int[] b){
         int i=0,j=b.length-1;
         while(i<j){
             if(b[i]==0 && b[j]!=0){
                 int t=b[i];
                 b[i]=b[j];
                 b[j]=t;
                 i++;
                 j--;
             } else if (b[i]!=0) {
                 i++;
             } else if (b[j]==0) {
                 j--;
             }
         }
     }

        public static void pushZerosToEnd(int[] arr) {
            int j=arr.length;

            int c=0;
            for(int i=0;i<j;i++){
                if(arr[i]!=0){
                    int t=arr[i];
                    arr[i]=arr[c];
                    arr[c]=t;

                    c++;
                }
            }

        }

}
