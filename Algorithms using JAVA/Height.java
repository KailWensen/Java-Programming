import java.util.Scanner;
class Height {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int h2 = in.nextInt();
        if(h1>h2){
            System.out.println("Person 1 is taller"); 
        }
        else{
            System.out.println("Person 2 is taller"); 
            
        }
        in.close();
    }
}