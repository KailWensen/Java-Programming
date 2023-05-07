

interface StringConcat
{
    String concat(String s1, String s2);
}

public class FucntionalInterfaceUsingLambda
{
    public static void main(String[] args)
    {
        StringConcat s=(m,n)-> m+n;

        System.out.println("Hello"+ s.concat(" AViral", "Srivastava"));
    }
}