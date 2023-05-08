import java.util.ArrayList;

class Student
{
    String RollNo;
    int Age;
    String Name;
    String course;

    Student(String RollNo, int Age, String Name, String course)
    {
        this.RollNo=RollNo;
        this.Age=Age;
        this.Name=Name;
        this.course=course;
    }

    void getInfo()
    {
        System.out.println(RollNo);
        System.out.println(course);
        System.out.println(Name);
        System.out.println(Age);
    }
}

public class userDefinedType
{
    public static void main(String[] args)
    {

        Student s1=new Student("20BCG10108", 20, "Aviral", "Btech CSE with Specialisation in Gaming Technology");
        Student s2=new Student("20BCG10108", 20, "Aviral", "Btech CSE with Specialisation in Gaming Technology");

        List<Student> Stud=new ArrayList<Student>();
        Stud.add(s1);
        Stud.add(s2);
    }

}

