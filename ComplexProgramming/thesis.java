//Aviral Srivastava 20BCG10108



class Student
{
    private int id;
    private double gpa;
    private String name;

    Student(int id, double gpa, String name)
    {
        this.gpa=gpa;
        this.name=name;
        this.id=id;
    }

    String getname()
    {
        return this.name;
    }

    double getGPA()
    {
        return this.gpa;
    }

    int getID()
    {
        return this.id;
    }

    void setName(String name)
    {
        this.name=name;
    }

    public String  toString()
    {
        return name+" "+id+" "+gpa;
    }
}

class undergrad extends Student
{
    
    private int year;

    undergrad(int id, double gpa, String name, int year)
    {
        super(id, gpa, name);
        this.year=year;

    }
    void setYear(int year)
    {
        this.year=year;
    }

    int getYear()
    {
        return this.year;
    }

    public String toString()
    {
        return super.toString()+" "+year;
    }
}

class graduate extends Student
{
    private String thesisTitle;

    graduate(int id, double gpa, String name, String thesisTitle)
    {
        super(id, gpa, name);
        this.thesisTitle=thesisTitle;
    }


    void setThesisTitle(String thesisTitle)
    {
        this.thesisTitle=thesisTitle;
    }

    String getThesisTitle()
    {
        return this.thesisTitle;
    }

    public String toString()
    {
        return super.toString()+" "+thesisTitle;
    }
}

class thesis
{
    public static void main(String[] args)
    {
        undergrad u = new undergrad(10108, 8.9, "Aviral",2020);
        System.out.println(u.toString());

        graduate g= new graduate(10108, 8.9, "Aviral", "ProgrammingInJAVA");
        System.out.println(g.toString());


    }
}