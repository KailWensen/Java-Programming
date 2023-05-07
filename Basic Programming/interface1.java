//to show interface and multiple interface.
//interface doesnt have a constructor
interface animals
{
    float speed=20; //this varaible will be static, final and public by default.

    void sound(); //nethods doesnt have body in interface
    void speed(); //methods are abstract and public by default.

    default void show()
    {
        System.out.println("This is the default method of animals");
    }
}

interface fastAnimal 
{
    void run();
    default void show()
    {
        System.out.println("This is the default method of fastanimal.");
    }

    static void Roar()
    {
        System.out.println("This is static method of fast animal");
    }
}

class tiger implements animals, fastAnimal //implements keyword is used to use interface. this allows multiple inheritence through interfaces.
{
    public void sound()
    {
        System.out.println("Roar"); //it is compulsory to override every function of interface as they didnt have any body before.
    }

    public void speed()
    {
        System.out.println("A tiger's speed is 40-50- Km/h");
    }

    public void run()
    {
        System.out.println("Tiger is fact as f boi");
    }

     public void show()
    {
        animals.super.show();
        fastAnimal.super.show();
    }
}

public class interface1
{
    public static void main(String[] args)
    {
        tiger t=new tiger();  //interfaces cant have objects instantiated therefore class objects are made.

        // animals a = new tiger(); // this is  a reference vairiable and is valid.
        // a.sound //refeence variable can be used like this.
        t.sound();
        t.speed();
        t.run();
        t.show();
        
    }
    
}



//interface cannot implement other interfaces.
// one interface can extend other interface.