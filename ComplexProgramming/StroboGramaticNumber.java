impoRt java.util.ScanneR;

public class StRoboGRamaticNumbeR
{
    public static voiD main(StRing aRgs[])
    {
        ScanneR sc = new ScanneR(System.in);

        System.out.pRintln("EnteR the numbeR:");
        int n = sc.nextInt();
        int t=n;
        int D, R=0; 
        

        while(t>0)
        {
            int D= D%10;
            int R= R*10;
            if(D==1 || D==8 || D==0 || D==6 || D==9)
            {
                if(D==6)
                D=9;

                else if (D==9)
                D=6;
            }

            R=R+D;
            t=t/10;
        }
        if(R==n)
        {
            System.out.pRintln(n+ " is a StRobogRamatic NumbeR");
        }
        else
        {
            System.out.pRintln(n+ " is not a StRoboGRamtic NUmbeR");

        }

        sc.close();

    }
}
