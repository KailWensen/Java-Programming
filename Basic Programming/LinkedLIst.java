import java.util.*;


public class LinkedLIst 
{
    public static void main(String[] args)
    {
        LinkedList<String>  LL1=new LinkedList<String>();

        LL1.add("Mouse");
        LL1.add("Keyboard");
        LL1.add("Monitor");

        System.out.println(LL1);

        Iterator itl= LL1.iterator();

        while(itl.hasNext())
        {
            System.out.println(itl.next());
        }
    }
}
