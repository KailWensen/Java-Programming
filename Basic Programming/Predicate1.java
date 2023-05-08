import java.util.function.*;

public class Predicate1 
{
    public static void main(String[] args)
    {
        Predicate<String> isLongString = new Predicate<String>();
        //Creating an anonymous class to give fuctionality to the Predicate.
        {@Override
            public boolean test(String s)
            {
                return s.length()<3;
            }

        };

        String s = "UnderStood";
        boolean r=isLongString.test(S);
    }
    
}1
