import java.io.*;
import java.util.*;


class Account
{
    private int account_number;
    private int account_balance;
    Scanner sc=new Scanner(System.in);

    Account(int p, int q)
    {
        account_number=p;
        account_balance=q;
    }

    public void deposit()
    {
        System.out.println("Enter the amount to deposit:");
        int a = sc.nextInt();
        account_balance= account_balance+a;
        System.out.println("Amount Added. New Account Balance="+account_balance);
    }

    public void withdraw()
    {
        System.out.println("Enter the amount to withdraw:");
        int a=sc.nextInt();
        if(account_balance<a)
        {
            System.out.println("Insufficient Balance in nyour account");
        }
        else
        {
            account_balance=account_balance-a;
            System.out.println("Amount Withdrawn. Remaining Account Balance="+account_balance);
        }

    }
   
}

class BankAccount       //Driver Class.
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Account Number and the Account Balance:");
        int acNo=sc.nextInt();
        int acBal=sc.nextInt();

        Account n1=new Account(acNo, acBal);

        System.out.println("Enter '1' to deposit money to the account and '2' to withdraw money from the account.");
        int ch=sc.nextInt();
        if(ch==1)
        n1.deposit();
        else if(ch==2)
        n1.withdraw();

        sc.close();


    }
}