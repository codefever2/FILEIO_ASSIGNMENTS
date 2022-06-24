import java.io.*;
import java.util.*;
public class FileRead
{
    public void fileWriter() throws IOException
    {
        File fi = new File("abc.txt");
        fi.createNewFile();
        FileWriter fw = new FileWriter(fi);
        fw.write("This is a new file.");
        fw.append("\n"+"I am appending a line.");
        fw.close();
        FileReader fr = new FileReader(fi);
        Scanner sc = new Scanner(fi);
        Scanner sc1 = new Scanner(fi);
        Scanner sc3 = new Scanner(System.in);
        int numOfLines=0,countwords=0;
        //To search the line count and if a word is present in the line -print the entire line
        System.out.println("Enter the word to check if it is present  in the line or not :");
        String  wordToCheckItsPresenceInLine = sc3.nextLine();
        int wordCountUsingLine=0,dummyTemp=0;
        while(sc1.hasNextLine())
        {
            numOfLines++;
           String y = sc1.nextLine();
           int start=0;
           for(int i=0;i<y.length();i++)
           {
               if ((y.charAt(i)==' ')||(y.charAt(i)=='.'))
               {
                   wordCountUsingLine++;
                   String gettingWordSubString=y.substring(start,i);
                  if(i!=y.length()-1)
                  {
                      start = i + 1;
                  }
                   if(gettingWordSubString.equals(wordToCheckItsPresenceInLine))
                    {
                      dummyTemp = 1;
                      System.out.println("word : "+wordToCheckItsPresenceInLine+" is present in the line : "+y);
                    }
               }
           }
        }
        if(dummyTemp==0)
        {
            System.out.println("The word:"+wordToCheckItsPresenceInLine+" is not present in any line");
        }
System.out.println("wordscountusing line:"+wordCountUsingLine);
        //to search if a word is present or not
        System.out.println("Enter the word to check if it is present or not :");
        String  wordToCheckItsPresence = sc3.nextLine();

        int dummyToShowWordPresent=0;
        while(sc.hasNextLine())
        {
            if(sc.hasNext())
            {
                String x = sc.next();
                if((x.equals(wordToCheckItsPresence)) && (dummyToShowWordPresent== 0))
                {
                    System.out.println("if entry");
                    dummyToShowWordPresent=1;
                }
                countwords++;
            }
        }
        if(dummyToShowWordPresent==1)
        {
            System.out.println("The word entered :"+wordToCheckItsPresence+" is present");
        }
        else
        {
            System.out.println("The word entered :"+wordToCheckItsPresence+" is not present");
        }
        System.out.println("No of lines : "+numOfLines+"\n"+"word count : "+countwords);

    }
}
