import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort 
{
    public static void main(String[] args)
    {
        List<Integer> L1= Arrays.asList(9,5,6,3,2,4,7,5);
        System.out.println(L1);

        List<Integer> L2= L1.stream().sorted().collect(Collectors.toList()); //sorting the list using sorted() fucntion of the stream.
        System.out.println(L2);
    }
    
}
