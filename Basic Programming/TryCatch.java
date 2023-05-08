import java.util.Scanner;

public class TryCatch 
{
    public static void main(String[] args)
    {
        //syntax
        /*try
        {
            //custom logic to catch exception

        }

        catch(Exception e) //if some exception comes in the try box then only the catch block will be executed
        {

        }


        finally
        {
             //Finally will be executed even if no exception is caught in try block.

        }*/

        Scanner s=new Scanner (System.in);

        int z=0;
        int x=s.nextInt();

        try{
            int y = s.nextInt();
            z=x/y;  //throws an exception object
        }

        catch (ArithmeticException e){
            System.out.println(" / by zero is not allowed");
        }

        finally{
            System.out.println("this will execute even if there is an exception");
        }

        System.out.println("this will execute if there is no excetion");
    }
}
