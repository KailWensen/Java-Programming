class StaticVar
{
    public static void main(String[] args)
    {
    int rollno;
    String name;
    static String college="VIT";

    StaticVar(int r, String n)
    {
        rollno=r;
        name=n;
    }

    void display()
    {
        
        System.out.println(rollno+" "+name+" "+college);
         
    }
}

    
}