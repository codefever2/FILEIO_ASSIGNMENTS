import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class BufferWriter
{
    public void bufferWrite() throws IOException
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the word to check and replace :");
        String wordToBeReplaced = sc3.nextLine();
        File f = new File("abc.txt");
        System.out.println("Enter the new word to replace :");
        String newWord = sc3.next();
        Scanner sc = new Scanner(f);
        StringBuffer sbu = new StringBuffer();
        while (sc.hasNextLine())
        {
            sbu.append(sc.nextLine() + System.lineSeparator());
            System.out.println("sbu :" + sbu);
        }
            String fileContents = sbu.toString();
            sc.close();

        Scanner sc1 = new Scanner(f);
        while(sc1.hasNextLine())
        {

            String y = sc1.next();
            if(y.equals(wordToBeReplaced))
            {
                fileContents = fileContents.replace(y,newWord);
                FileWriter fw1 = new FileWriter("abc.txt");
                fw1.append(fileContents);
                fw1.close();
            }
        }

    }
}
