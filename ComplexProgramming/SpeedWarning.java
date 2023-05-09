import java.util.*;




class SpeedWarning 
{
    public static void main (String args[])
    {
        int ch=1;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the speed of the vehicle:");
        int s= sc.nextInt();

        while(ch<4)
        {
            switch(ch)
            {
                case 1:
                {   if(s==0)
                    {System.out.println("The vehicle is at rest.");
                    break;}

                    else if (s>0)
                    break;
                }
                case 2:
                {
                    if(s>0 && s<60)
                    {System.out.println("You are under the speed limit");
                    break;}

                    else if (s>60)
                    break;
                }
                case 3:
                {
                    if(s>60)
                    System.out.println("You are going over the speed limit, slow down.");
                    break;

                }

                default:
                System.out.println("Error Reading the speed");
            }
            ch++;
        }
    } 
    
}
