public class MaximumEquilibriumSum {
    public static void main(String[] args) {
        // int[] arr = {-1,2,3,0,3,2,-1};
        int[] arr = {-2,5,3,1,2,6,-4,2};

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(i);
            int sum1=0,sum2=0;
            for(int j = 0; j<i; j++){
                sum1 += arr[j];
            }    
            for(int k = arr.length-1; k>i; k--){
                sum2 += arr[k];
            }    
            if(sum1 == sum2){
                System.out.println("Prefix = Suffix \n"+sum1);
                
            }
            else{
                // System.out.println("Error");

            }

        }
    }
}
