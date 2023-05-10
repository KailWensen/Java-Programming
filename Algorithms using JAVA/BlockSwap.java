import java.util.Scanner;

public class  BlockSwap {
    public static void swap(int[] arr, int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            
            int temp = arr[fi+i];
            arr[fi+i] = arr[si+i];
            arr[si+i] = temp;
        }
    }

    
    public static void leftRotate(int[] arr, int d, int n){
        leftRotateRec(arr, 0, d, n);
        
    }
    public static void leftRotateRec(int[] arr,int i, int d, int n){
        if(d==0 || n==0) {
            return;
        }
        else if(n-d==d){
            swap(arr,i,(n-d+i),d);
            return;
        }
        else if(d < n-d){
            swap(arr, i, n-d+i, d);
            leftRotateRec(arr,i, d, n-d);
        }
        else{
            swap(arr, i, d, n-d);
            leftRotateRec(arr,n-d+i, 2*d-n, d);
        }   
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Before");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter d ");
        int d = in.nextInt();
        int n = arr.length;
        leftRotate(arr, d, n);
        in.close();
        System.out.println("\nAfter");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
