

public class varargs
{
    public void sum(double ...args)
    {
        System.out.println("No. of arguments entered:"+ args.length);
        double sum=0;

        for(int i=0; i<args.length; i++)
        {
            sum=sum+args[i];
        }

        System.out.println("Sum="+sum);
    }

    public void factorial(int ...args)
     {  
        for(int i=0; i<args.length; i++)
        {   int factorial=1;
            for(int j=1; j<=args[i]; j++)
            {
                factorial= factorial*j;
            }
            System.out.println("The factorial of "+args[i]+" is: "+ factorial);

        }
        

    }

    public static void main(String[] args)
    {
        varargs v=new varargs();

        v.sum(66,78,56,32,34);

        v.sum(12,12,120);

        v.factorial(10,19,11);

    }
}