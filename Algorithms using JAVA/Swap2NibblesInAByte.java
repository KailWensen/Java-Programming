import java.util.Scanner;

public class Swap2NibblesInAByte {

    static int swapNibbles(int x) {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    static void swapNibbles2(int num) {
        String st = Integer.toBinaryString(num);
        int len = st.length();
        for (int i = 1; i <= 8 - len; i++)
            st = "0" + st;

        String str = st.substring(4) + st.substring(0, 4);
        // System.out.println(st);
        // System.out.println(str);
        System.out.println(Integer.parseInt(str, 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(swapNibbles(num));
        swapNibbles2(num);

        in.close();

    }
}

/*
 * 
 * 0110 0100
 * 
 * 
 */