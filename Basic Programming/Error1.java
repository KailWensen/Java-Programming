class person{
    static void CheckAge(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException(" Access Denied You must be over 18");
        }
        else 
        System.out.println("Access Granted");

    }
}

public class Error1 
{
    public static void main(String[] args)
    {
        try{
            person.CheckAge(19);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Excetpion block is caught properly");
        }

        finally{
            System.out.println("Finally block execution");
        }
    }

    
    
}
