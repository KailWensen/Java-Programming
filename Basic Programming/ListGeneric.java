import java.util.*;


public class ListGeneric
{
    public static void main(String[] args)
    {
        LinkedList<String>  LL1=new LinkedList<String>();

        LL1.add("Mouse");
        LL1.add("Keyboard");
        LL1.add("Monitor");

       String i=LL1.iterator().next();

        System.out.println(i);
    }
}
