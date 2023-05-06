import java.io.*;

public class Error2 {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fis=null;
        fis=new FileInputStream("G:/JAva.txt"); //throws the filenot found exception
        int k;
        // compiler will check for the file and throw the checked IO exception 

        while(( k=fis.read() ) !=-1)
        {
            System.out.println((char) k);

        }

        fis.close();


    }
}
