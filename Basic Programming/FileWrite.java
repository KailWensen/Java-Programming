import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileWrite 
{
    public static void main(String[] args)
    {
      Stream<String>  stream;

        try{

            //File Creation and file writing
            File f1= new File("D:\\mynewfile.txt");
            f1.createNewFile();

            String str = "This is a new file created \n Next line on the file.";

            FileWriter fw = new FileWriter(f1);
            fw.write(str);
            fw.close();



            //File Read
            Path pf = Paths.get("D:\\mynewfile.txt");
            List<String> l1= Files.readAllLines(pf);
            System.out.println(l1);

            stream = Files.lines(pf);
            stream.forEach(System.out::println);
            stream.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    
}
