//to make a generic method that works on any given data type and provides data manipuraltion.

//provides code reusibility and typesafety. shortening of code and saves time.


public class GenericMethod 
{
    public static <E> void print(E[] inputArray)
    {
        for(E element: inputArray)
        {
            System.out.printf(" %s ", element);
        }
        System.out.println(" ");
    }

    public static void main (String[] args)
    {
        Integer[] intArray = {1,4,6,8,10};
        print(intArray);

        String[] strArray = {"Aviral", "Mouse", "Keyboard"};
        print(strArray);
    }

    
}
