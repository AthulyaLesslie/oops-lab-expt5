import java.io.*;
import java.util.*;
class experiment2
{
    public static void main(String args[])throws Exception
    {
        try
        {
            FileInputStream fin=new FileInputStream("e2.txt");
            int ch;
            int c=-1,l=0,w=0;
            while((ch=fin.read())!=-1)
            {
                c++;
                if(ch=='\n')
                  l++;
                if(ch==' '||ch=='\n')
                  w++;
            }
            System.out.println("no of characters ="+c);
            System.out.println("no of words ="+w);
            System.out.println("no of LINES ="+l);
            fin.close();


        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
