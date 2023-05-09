// Write an application  that  reads  five  numbers between  1  and  30.  
// For  each  number  that  is  read, your  program  should  display  the  same  number  of  adjacent  asterisks.  
// For  example,  if your  program  reads  the  number  7,  it  should  display  *******. 
//  Display  the  bars  of asterisks after your read all five numbers.

import java.io.*;
import java.util.*;

public class BarGraph 
{
    public static void main(String[] args)
    {
        System.out.println("Aviral Srivastava 20BCG10108");

        int nb[]=new int[5];
        Scanner input = new Scanner (System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Please, Enter a number between 1 - 30 ");
            nb[i]=input.nextInt();
        }
        input.close();


    
        for(int i = 0; i <  nb.length; i++)
        {
            for(int j=1;j<=nb[i];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
