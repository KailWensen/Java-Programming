import java.util.Scanner;
public class HyphenStart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int n = x.length();
        int count=0;
        String y ="";
        for (int i = 0; i < n; i++) {
            if(x.charAt(i) == '-'){
                count++;
            }
            else{
                y = y + x.charAt(i);
            }
        }
        System.out.println(y);
        String res = "";
        for (int i = 0; i < count; i++) {
            res+="-";
        }
        res+=y;
        System.out.println(res);
        in.close();
    }
}
