import java.util.Scanner;

public class StrobogrammaticNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        
        int temp1;
        String s = Integer.toString(n);
        System.out.println(s);
        int len = s.length();

        int arr[] = new int[15];

        for (int i = 0; i < len; i++) {
            temp1 = n % 10;
            arr[i] = temp1;
            n = n / 10;
        }

        for (int j = 0; j < len; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");

        for (int i = 0; i < len;) {
            if (arr[i] == 2 || arr[i] == 3 || arr[i] == 4 || arr[i] == 5 || arr[i] == 7) {
                System.out.println("not st.... number");
                break;
            }

            else {
                System.out.println("it is st..... number");
                break;
            }

        }

    }
}