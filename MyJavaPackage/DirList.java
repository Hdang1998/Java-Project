import java.io.*;
public class DirList
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("D:\\boot\\..");
        System.out.println(dir.getCanonicalPath());
        System.out.println(dir.getAbsolutePath());
        /*File[] f=dir.listFiles();
        for(File d:f)
        {
            System.out.println(d.getCanonicalPath());
            System.out.println(d.getAbsolutePath());
        }*/
    }
}