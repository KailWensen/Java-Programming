import java.util.stream.Stream;

import java.util.stream.*;
import java.util.*;

public class SreamData 
{
    public static void main(String[] args)
    {
        Stream<Integer> stream= Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p*2));

        Stream<Integer> stream1= Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
        stream1.forEach(p -> System.out.println(p+9));

        List<Integer>  l1=new ArrayList();
        for(int i=0; i<10; i++)
        {
            l1.add(i);
        }

        Stream<Integer> stream2= l1.stream();
        stream2.forEach(p-> System.out.println(p*3));
    }
    
}
