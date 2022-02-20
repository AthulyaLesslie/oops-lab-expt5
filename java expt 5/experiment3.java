import java.util.*;
import java.io.*;
class experiment3 
{
    public static void main(String args[])
    {
        try
        {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        FileWriter fw=new FileWriter("e3.txt");
        System.out.print("name");
        String name=sc.next();
        System.out.println("address");
        String address=sc1.next();
        fw.write(name+"\n");
        fw.write(address+"\n");
        fw.close();
        FileReader fr=new FileReader("e3.txt");
        int ch=0;
        while((ch=fr.read())!=-1)
          System.out.println((char)ch);
        System.out.println("\n");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
