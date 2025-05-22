package EXwiTAns;

public class RotatedArray {

    //traditional way
    public static void tdrotateArr(int[] a,int d){

        int n=a.length;
        for(int i=0;i<d;i++){
            int f=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=f;
        }

    }
   public static void rotateArr(int arr[], int d) {
        // add your code here
        int n= arr.length;

        d%=n;
        int[] b=new int[n];

        for(int i=0;i<n-d;i++){
            b[i]=arr[d+i];
        }
        for(int j=0;j<d;j++){
            b[n-d+j]=arr[j];
        }
        for(int k=0;k<n;k++){
            arr[k]=b[k];
        }

    }
}

