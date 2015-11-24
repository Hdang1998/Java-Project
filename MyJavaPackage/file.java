import java.util.*;
import java.io.*;
public class file
{
    void WriteFile()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        File f=new File("D:\\Harshit.txt");
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        System.out.println("Write a sentence");
        String s=sc.nextLine();
        bw.write(s);
        bw.newLine();
        bw.close();
    }
    void readFile()throws IOException
    {
        try
        {
            File f=new File(System.getenv("userprofile")+"/Desktop/Harshit.txt");
            FileReader fr=new FileReader(f);
            Scanner sc=new Scanner(fr);
            while(sc.hasNextLine())
            {
                String s=sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("sdfsdf");
        }
    }
}
