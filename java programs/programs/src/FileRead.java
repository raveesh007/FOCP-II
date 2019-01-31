import java.util.*;
import java.io.*;

class FileRead
{
   public static void main(String args[])
   {
   	try
	{
	    File f = new File("file.txt");
	    FileReader fin = new FileReader(f);
	    BufferedReader bin = new BufferedReader(fin);
	    String b;
	    String c;
	    int flag=0;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter the word you want to find : ");
        b = s.next();
	    while((c = bin.readLine())!=null)
	    {
	        
	        String[] a = c.split(" ");
	        for (int i=0;i<a.length;i++)
	        {
	            if(a[i].equals(b))
	            flag=1;	
	        }
	        if(flag==1)
	        {
	           System.out.print("\n WORD FOUND!");
	           break;
	        }
	        else 
	        {
	          System.out.print("\n NOT FOUND!");
	        }
	    }	
	  }
	  catch(Exception e)
	  {
	  	e.printStackTrace();
	  }
	
	}
}