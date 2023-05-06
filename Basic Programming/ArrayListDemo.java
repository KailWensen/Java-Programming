import java.io.*;
import java.util.*;



public class ArrayListDemo 
{
    public static void main(String[] args)
    {
        ArrayList<String> L1= new ArrayList<String>();// Syntax to declare ArrrayList with the type of the data in the list in the "< >"
        ArrayList<Float> L2= new ArrayList<Float>();

        L2.add(69.0f);//using preset methods in java collection library
        L2.add(786.0f);//to add elements to the list
        System.out.println(L2);
        //L2.clear();//to clear the list and remove all data

        Iterator itl= L2.iterator();//to import iterator class and use its function.

        while(itl.hasNext())//hasnext returns true if theere are more elements in the list
        {
            System.out.println(itl.next());//next returns the next element in the list
        }

        L1.add("element 1");
        L1.add("element 2");
        L1.add("Element 3");
        System.out.println(L1.size());

        L1.add(0,"Element 0");//to add element at a specific index and the inserted element will push other elements forward instead of overriding the element at the given index.
        System.out.println(L1);
        
        L1.remove(2);//to remove the element at this index. It will pish all the other element back. 
        System.out.println(L1);

        ArrayList<String> LL1=new ArrayList<String>();
        LL1=(ArrayList<String>)L1.clone();

        System.out.println("LL1:"+LL1);

    }
    
}
