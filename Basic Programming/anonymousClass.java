public class anonymousClass 
{
    interface hello
    {
        public void greet();
    }

    public void myGreetings()
    {
        class casualGreeting implements hello
        {
            public void greet()
            {
                System.out.println("World");;
            }

        }
        casualGreeting c= new casualGreeting();
        c.greet();
    }

    public static void main(String[] args)
    {
        anonymousClass ac=new anonymousClass();
        ac.myGreetings();
    }
    
}
