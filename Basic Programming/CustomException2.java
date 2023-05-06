import java.lang.System;

class DivideByZero extends ArithmeticException
{
    public DivideByZero(String message)
    {
        super(message);
    }
}




public class CustomException2 
{
    public static void main (String[] args)
    {
        try{
            double x = 5;
            double y = 0;
            double z= x/y;

            throw new ArithmeticException("New Arithmetic Exception");
        }

        catch (DivideByZero e){
        System.err.print(e);
        }
    }
    
}
