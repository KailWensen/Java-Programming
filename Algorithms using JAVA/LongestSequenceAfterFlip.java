import java.util.Scanner;

public class LongestSequenceAfterFlip {
    private static int maxConsecutiveOnes(int x)
    {
        int count = 0;
        while (x!=0){
            x = (x & (x << 1));
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        Integer x = Integer.parseInt(n,2);
        System.out.println(maxConsecutiveOnes(x));
        
        
        
        
        // int[] arr = new int[num.length()];
        // int[] counter = new int[num.length()];
        // for(int i=0; i<num.length(); i++) {
        //     if(num.charAt(i)=='1') {
        //         arr[i] = 0;
        //     }
        // }
        // int count=0;;
        // for (int j = 0; j < arr.length; j++) {
        //     count=0;
        //     for (int i = 0; i < num.length(); i++) {
        //         if(num.charAt(i)=='1') {
        //             count++;
        //         }
        //         else {
        //             arr[i] = i;
        //             break;
        //         }
        //     }
        //     counter[j]=count;
        // }
        // System.out.println("----- 0 array");
        // for (int j : arr) {
            
        //     System.out.print(arr[j]);
        // }
        // System.out.println("\n");

        // System.out.println("----- Counter array");
        // for (int x =0; x<counter.length; x++) {
            
        //     System.out.print(counter[x]);
        // }
        // System.out.println("\n Count = "+count);

    }
}
