import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

class employee
{
    private int ID, Age;
    private double Salary;
    private String Fname, Sname;

    employee(int ID, int Age,String Fname,String  Sname,int  Salary)
    {
        this.Age=Age;
        this.Fname=Fname;
        this.ID=ID;
        this.Salary=Salary;
        this.Sname=Sname;
    }

    double getSalary()
    {
        return Salary;
    }

    int getAge()
    {
        return Age;
    }
    int getID()
    {
        return ID;
    }
    String getFname()
    {
        return Fname;
    }
    String getSname()
    {
        return Sname;
    }
}

    


public class PredicateUse 
{
    public static void main(String[] args)
    {
        employee e1= new employee(1, 20, "Aviral", "Srivastava", 1000000);
        employee e2= new employee(2, 22, "Avirall", "Srivastavaa", 10045000);
        employee e3= new employee(3, 28, "Aviralll", "Srivastavaaa", 10120000);
        employee e4= new employee(4, 29, "Avirallll", "Srivastavaaaa", 11200000);
        employee e5= new employee(5, 33, "Avirallll", "Srivastavaaaaa", 1010000);
        employee e6= new employee(6, 56, "Avirallllll", "Srivastavaaaaaa", 121000000);
    

    List<employee> l1=new ArrayList<employee>();
    Collections.addAll(Arrays.asList(l1, e1, e2, e3, e4, e5, e6));

    Predicate<String> p1 = p-> p.getFname().startsWith("A");
    Predicate<Integer> p2 = p-> p.getAge()>25;
    
    
    l1.stream().filter(p1).forEach(System.out::println); // using that predicate as a filter in Stream
    l1.stream().filter(p2).forEach(System.out::println);
    }


}

