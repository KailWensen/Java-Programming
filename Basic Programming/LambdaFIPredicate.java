import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class LambdaFIPredicate {
    public static void main(String[] args) {
        Predicate<String> pf = s -> s.length() > 10; // Creating a Predicate with Lambda expression
        Predicate<String> pf2 = s -> s.startsWith("S");

        System.out.println(pf.test("hello"));
        System.out.println(pf.test("Succesfully"));
        System.out.println(pf2.test("Understood"));

        List<String> l1 = new ArrayList<String>();

        Collections.addAll(l1, "Greatfulness", "Usefulness", "Succesfully", "Politeness"); // using the addAll()
                                                                                           // function of collections to
                                                                                           // add elements to the list.

        l1.stream().filter(pf2).forEach(System.out::println); // using that predicate as a filter in Stream
        l1.stream().filter(pf).forEach(System.out::println);

    } 
}