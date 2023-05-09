//Toy Store Assistant Application By Aviral Srivastava(20BCG10108)

import java.io.*;
import java.util.*;

class customer
{
    Scanner sc=new Scanner(System.in);

    void enter()
    {
        System.out.println("A customer has entred the store.");
    }

    int get_age()
    {
        System.out.println("Enter the age of the child:");
        int a=sc.nextInt();

        return a;
    }

    char get_gender()
    {
        System.out.println("Enter the gender of the child: (Use 'M' for male for 'F' For female");
        char g=sc.next().charAt(0);

        return g;
    }

    int get_budget()
    {
        System.out.println("Please Enter your Budget: ");
        int b=sc.nextInt();

        return b;
    }

    
}

class toys
{
    public void male_above_10()
    {
        System.out.println("Recommended Toys/Games: \n 1. Video Games \n 2. remote comtrolled Airplane \n 3. Board Games: Chess, Carrom.");
    }

    public void male_below_10()
    {
        System.out.println("Recommended Toys/Games: \n 1. Construction/Lego/Clay set.\n 2. Toy Guns/ Robots   \n 3. Board Games: Ludo, Monopoly");
    }

    public void female_above_10()
    {
        System.out.println("Recommended Toys/Games: \n 1. Nail Art/ Jwellery Making Set \n 2. Quiling Set \n 3. Board Games: Chess, Checkers");
    }

    public void female_below_10()
    {
        System.out.println("Recommended Toys/Games: \n 1. Doll Set \n 2. Soft toys \n 3. Board Games: Ludo, Monopoly");
    }

}

class Assistant extends toys
{
    void show_info(int age, char gender, int budget)
    {
        System.out.println("The Information entered by the customer is:");
        System.out.println("Age of the child: "+ age + "\n Gender: "+gender+ "\n Customers budget: "+budget);
    }

    void give_suggestions(int age, char gender)
    {
        if(gender=='m')
        {
            if(age>10)
            {
                super.male_above_10();
            }

            else 
            {
                super.male_below_10();
            }
        }

        else if (gender== 'f')
        {

            if(age>10)
            {
                super.female_above_10();
            }

            else 
            {
                super.female_below_10();
            }
        }

        else 
        {
            System.out.println("Invalid Input from the customer. Please CHeck your inputs again.");
        }

        System.out.println("All the recommendations are under the Customer's budget.");
    }
}

class ToyStore
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Toy Store Assistant Application by Aviral Srivastava 20BCG10108");

        customer c1=new customer();
        c1.enter();
        int age=c1.get_age();
        char gender=c1.get_gender();
        int budget=c1.get_budget();

        Assistant bot = new Assistant();

        bot.show_info(age, gender, budget);
        bot.give_suggestions(age, gender);

        
    }
}