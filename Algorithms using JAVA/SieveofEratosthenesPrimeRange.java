//Sieve of eratosthenes is used to find prime numbers between the range of 2 to n or upto n.
// Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will be selected and all of its multiple will be marked
        //false. 
        // finally be the entries of the array will be false if i is Not a prime, else true.


import java.util.*;

public class SieveofEratosthenesPrimeRange 
{
    public static void sieveOfEratosthenes(int n)
    {
        
        boolean prime[] = new boolean[n+1];

        Arrays.fill(prime, true); //Initialise all the values as true
       
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true) //To run the loop only for the entries that are true.
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p) //a less optimised way will be to run the loop from 2*p
                    prime[i] = false;
            }
        }
         
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
     
    // Driver Program to test above function
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper range for the prime numbers: ");
        int n = sc.nextInt();
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        
        sieveOfEratosthenes(n);
    }
}


