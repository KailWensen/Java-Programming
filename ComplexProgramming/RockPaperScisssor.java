//Program to Create Rock Paper Scissor Game.


import java.io.*;
import java.util.*;

class RockPaperScisssor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String p1, p2;

        System.out.println("This Is a game of Rock Paper and scissors created by Aviral Srivastava (20BCG10108)");

        System.out.println("Player 1, enter your move:");
        p1=sc.nextLine();
        p1=p1.toLowerCase();
        
        System.out.println("Player 2, enter your move:");
        p2=sc.nextLine();
        p2=p2.toLowerCase();

        switch(p1)
        {
            case "rock":
                switch(p2)
                {
                    case "rock":
                    System.out.println("Its a Tie!");
                    break;

                    case "paper":
                    System.out.println("Player 2 Wins!");
                    break;

                    case "scissors":
                    System.out.println("Player 1 Wins!");
                    break;

                    default:
                    System.out.println("Player 2 invalid Input");
                }
            break;
            
            case "paper":
                switch(p2)
                {
                    case "rock":
                    System.out.println("Player 1 Wins!");
                    break;

                    case "paper":
                    System.out.println("Its a Tie!");
                    break;

                    case "scissors":
                    System.out.println("Player 2 Wins!");
                    break;

                    default:
                    System.out.println("Player 2 invalid Input");
                }
            break;

            case "scissors":
                switch(p2)
                {
                    case "rock":
                    System.out.println("Player 2 Wins!");
                    break;

                    case "paper":
                    System.out.println("Player 1 Wins!");
                    break;

                    case "scissors":
                    System.out.println("Its a Tie!");
                    break;

                    default:
                    System.out.println("Player 2 invalid Input");
                }
            break;

            default:
            System.out.println("Player 1 Invalid Input");

        }

                
    }
    
}