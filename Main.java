
//merge 2 files into a new file
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        File f1 = new File("File1.txt");
        f1.createNewFile();
        PrintWriter fw1 = new PrintWriter(f1);
        fw1.println("AAA");
        fw1.println("BBB");
        fw1.println("CCC");
        fw1.close();
        File f2 = new File("File2.txt");
        f2.createNewFile();
        PrintWriter fw2 = new PrintWriter(f2);
        fw2.println("111");
        fw2.println("222");
        fw2.println("333");
        fw2.close();
        File f3 = new File("File3.txt");
        f3.createNewFile();
        PrintWriter fw3 = new PrintWriter(f3);
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        while(s != null)
        {
            fw3.println(s);
            s= br.readLine();
        }
        br.close();
        BufferedReader br1 = new BufferedReader(new FileReader(f2));
        s=br1.readLine();
        while(s != null)
        {
            fw3.println(s);
            s=br1.readLine();
        }
        br1.close();
        fw3.close();
        //using one print writer will merge
        //if two print writer is used it will override
    }
}