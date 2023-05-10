import java.util.Scanner;
public class BunjeeJump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        int weight = in.nextInt();
        if(age >= 12){
            if(weight >=40){
                if(weight <= 110){
                    System.out.println("He can Jump"); 
                }
                else{
                    System.out.println("Extra ropes will be added"); 
                }
            }
            else{
                    System.out.println("He can't Jump"); 
            }
        }
        else{
            System.out.println("He can't Jump"); 
            
        }
        in.close();
    }
}