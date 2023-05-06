import java.lang.Exception;
import java.lang.System;

class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}

class CustomException
{
    public static void main(String[] args)
    {
        try{
            String customerID= null;
            if(customerID==null)
            {
                throw new MyException("Customer ID Cannot be null");    
            }
        }

        catch(MyException e){
            System.err.print(e);
        }

        System.out.println("Program Ends");
    }
}