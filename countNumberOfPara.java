import java.io.*;
public class countNumberOfPara
{
    public static void main(String args[]) throws IOException
    {
        File f = new File("abc2.txt");
        int paragraphCount=0;
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line =br.readLine();
        int j=0;
        while(line != null)
        {
            System.out.println("j : "+(j++)+"line :"+line);
            if(line.equals(""))
            {
                paragraphCount++;
            }
            line =br.readLine();
            if(line == null)
            {
                paragraphCount++;
            }
        }
        System.out.println(paragraphCount);
    }
}