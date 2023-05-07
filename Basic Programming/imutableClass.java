final class Driver
{
    private final int eid;
    private final String ename;

    public int get_eid()
    {
        return eid;
    }

    public String get_ename()
    {
        return ename;
    }

    Driver(int eid, String ename)
    {
        this.eid=eid;
        this.ename=ename;
    }
}

class imutableClass
{
    public static void main(String args[])
    {
        Driver obj= new Driver(42069, "Aviral");//once set, we cannot change the value of these variables as they are bind with the 'final' keyword.

        System.out.println(obj.get_eid());
        System.out.println(obj.get_ename());


    }
}