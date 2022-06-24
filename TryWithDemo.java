import java.io.FileReader;
import java.io.IOException;

public class TryWithDemo
{
    public static void main(String args[]) {
        try(FileReader fr = new FileReader("one.txt")) //entering the file name that is not present in the system
        {
            char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//LINK:https://www.tutorialspoint.com/Automatic-resource-management-in-Java#:~:text=automatic%20resource%20management%20or%20try,within%20the%20try%2Dcatch%20block.