import java.io.*;
import java.util.*;

class Petrol
{
    float price=100;
    float amount, quantity;
    
    void setPrice(float p)
    {
        price=p;
    }

    Petrol()
    {
        amount=0;
        quantity=0;
        
    }

    void enterAmount()
    {
        System.out.println("Enter the amount:");
        Scanner sc= new Scanner(System.in);
        amount=sc.nextFloat();
        quantity=amount/price;
        System.out.printf("Petrol Dispensed= %.2fL %n Amount to be paid: %.2f", quantity, amount);
    }

    void enterQuantity()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the quantity of petrol to be dispensed: ");
        quantity=sc.nextFloat();
        amount= quantity*price;
        System.out.printf("Petrol Dispensed= %.3fL %n Amount to be paid: %.2f", quantity, amount);
        sc.close();
    }
}

class petrolpump
{
    public static void main(String args[])
    {
        String choice;
        Scanner sc=new Scanner(System.in);
        Petrol p1= new Petrol();
        System.out.println("Enter the Price of the petrol according to which you want the calculation to be done:");
        float p=sc.nextFloat();
        p1.setPrice(p);
        System.out.println("Enter the The amount of Petrol or the Quantity oof petrol to  be filled.");
        System.out.println("Enter 'q' for quantity and 'a' for amount.");
        choice=sc.next();

        switch(choice)
        {
            case "q":
            p1.enterQuantity();
            break;

            case "a":
            p1.enterAmount();
            break;
        }
        sc.close();
    }
}