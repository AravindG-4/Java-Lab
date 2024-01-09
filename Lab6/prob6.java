import java.io.*;
public class prob6
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout= new FileOutputStream("File.txt");
            fout.write(65);
            fout.write(32);
            String s="NEW FILE";
            byte b[]=s.getBytes();
            fout.write(b);
            System.out.println("SUCCESS");
            fout.close();
            FileInputStream fin=new FileInputStream("File.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
            System.out.print((char)i);
            }
            System.out.println("\nSUCCESS");
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
    }
    }
    }