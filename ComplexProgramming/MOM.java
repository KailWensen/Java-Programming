//MOM Application by AVIRAL SRIVASTAVA 20BCG10108

import java.io.*;
import java.util.*;

class Food //class to get food items and choice of the members
{
    Scanner sc = new Scanner(System.in);
    String[] f = new String[10];

    public void getFood() // to get food items from the user
    {

        System.out.println("Enter the Food items to choose from: (5 items)");
        for (int i = 1; i <= 5; i++) 
        {
            f[i] = sc.next();
        }
    }

    public void displayFood() //display the food items available for choice
    {
        System.out.println("The Choice for today's food is:");
        int n = 1;
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(n + "." + f[i]);
            n++;
        }
        n = 0;
    }



    void getChoice() //to get choice of each member.
    {
        displayFood();
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        switch (ch) {
            case 1:
                c1++;
                break;

            case 2:
                c2++;
                break;

            case 3:
                c3++;
                break;

            case 4:
                c4++;
                break;

            case 5:
                c5++;
                break;

            default:
                System.out.println("Invalid Choice");
        }
        if (c1 > c2 && c1 > c3 && c1 > c4 && c1 > c5) 
        {
            System.out.println("The majority of the members chose " + f[1] + " as their choice of dish");
        }
        else if (c2 > c1 && c2 > c3 && c2 > c4 && c2 > c5) 
        {
            System.out.println("The majority of the members chose " + f[2] + " as their choice of dish");
        }
        else if (c3 > c2 && c3 > c1 && c3 > c4 && c3 > c5) 
        {
            System.out.println("The majority of the members chose " + f[3] + " as their choice of dish");
        }
        else if (c4 > c2 && c4 > c3 && c4 > c1 && c4 > c5) 
        {
            System.out.println("The majority of the members chose " + f[4] + " as their choice of dish");
        }
        else if (c5 > c2 && c5 > c3 && c5 > c4 && c5 > c1) 
        {
            System.out.println("The majority of the members chose " + f[5] + " as their choice of dish");
        }
        else
        {
            displayFood();
            System.out.println("The choice was a draw. Please select a dish randomly");
        }

    }

}


//Driver Class
class MOM 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("MOM Application by Aviral Srivastava 20BCG10108");

        Food obj1=new Food();
        obj1.getFood();
        obj1.displayFood();

        System.out.println("Enter the number of members:");
        int n=sc.nextInt();

        for(int i =1; i<=n; i++)
        {
            System.out.println("Member "+i);
            obj1.getChoice();
        }
        System.out.println("MOM Application by Aviral Srivastava 20BCG10108");

    }
}