import java.io.*;

public class ExtractUnwantedNumbers
{
    public static void main(String[] args) throws IOException {
        File f = new File("output.txt");
        f.createNewFile();
        PrintWriter pw = new PrintWriter(f);
        BufferedReader br = new BufferedReader(new FileReader("call.txt"));
        String line = br.readLine();
        while(line != null)
        {
            BufferedReader br1 = new BufferedReader(new FileReader("remove.txt"));
            String line1 = br1.readLine();
            int temp =0;
            while(line1 != null)
            {
                if(line1.equals(line))
                {
                    System.out.println(line);
                    temp =1;
                    break;
                }
                line1 = br1.readLine();
            }
            br1.close();
            if(temp==0)
            {
                pw.println(line);
            }
            line= br.readLine();
        }
        br.close();
        pw.close();
    }
}
