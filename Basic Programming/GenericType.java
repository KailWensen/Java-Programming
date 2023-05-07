//generic types are made to allow working with any object type, no matter what type you pass in it, it will manipulate it and work with it

//Provides TypeSafety, and the hastle to apply typecasting is no longer requuired.

class Student<T> //generic variable T
{
    T obj;  //making a generic object

    Student(T obj)   //constructor to assign value to the object
    {
        this.obj=obj;
    }

    public T getObject() //method to return the object value.
    {
        return this.obj;
    }
}


//Driver Class
public class GenericType
{
    public static void main(String[] args)
    {
        Student<Integer> iobj= new Student<Integer>(420);   //using the generic class with integer type 
        System.out.println(iobj.getObject());

        Student<String> sobj= new Student<String>("Hello this is string output");  //using the same generic class for String type.
        System.out.println(sobj.getObject());
    }
}