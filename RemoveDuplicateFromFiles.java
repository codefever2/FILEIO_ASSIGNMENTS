import java.io.*;
public class RemoveDuplicateFromFiles
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("outputWithoutDuplicates.txt");
        f.createNewFile();
       // BufferedReader br = new BufferedReader(new FileReader(f));
        BufferedReader brWithDup = new BufferedReader(new FileReader("DuplicateElements.txt"));
        PrintWriter pw = new PrintWriter(f);
        String dupLine = brWithDup.readLine();
        while(dupLine != null )
        {
            int temp =0;
            BufferedReader br = new BufferedReader(new FileReader(f));
            String lineToBeChecked = br.readLine();
            while(lineToBeChecked != null)
            {
                if(lineToBeChecked.equals(dupLine))
                {
                    temp=1;
                    //System.out.println("break");
                    break;
                }
                lineToBeChecked=br.readLine();
            }
            br.close();
            if(temp==0)
            {
                //System.out.println(dupLine);
                pw.println(dupLine);
                pw.flush();
            }
            dupLine=brWithDup.readLine();
        }
//        brWithDup.close();
//        pw.close();

    }
}
