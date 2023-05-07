import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy 
{
    public static void main(String[] args) throws IOException
    {
        Path sourcePath = Paths.get("D:\\COLLEGE\\Class Material\\Computer Languages\\Semester 3 Java\\File1.txt");

        //Files.delete(sourcePath);
        //Files.createFile(sourcePath);

        Path destinationPath = Paths.get("D:\\COLLEGE\\Class Material\\Computer Languages\\Semester 3 Java\\Basic Programs]\\File1.txt");
        Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);


    }
}
