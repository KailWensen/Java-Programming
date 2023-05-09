import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class employee
{
    double Salary;
    String Name;

    employee(String Name, double Salary)
    {
        this.Name=Name;
        this.Salary=Salary;
    }

    double GetSal()
    {
        return Salary;
    }

    public String toString()
    {
        return "Name:"+ Name + "Salary: "+Salary;
    }


}

class EmployeeStream
{
    public static void main (String[] args)
    {
        double bonus=1000;
        employee[] arrayOfEmp={   
            new employee("Jeff B", 10000);
            new employee("Bill G", 60000);
            new employee("Elon M", 50000);
            new employee("MArk Z", 20000);
        };

        Stream.of(arrayOfEmp);


        List<employee> EmpList=Arrays.asList(arrayOfEmp);

        List<employee> emp=EmpList.stream().filter(x -> x.GetSal()>2000).collect(Collecots.toList());
        System.out.println();
    }
}