import java.io.*;
import java.util.*;
class FileDemo1
{

  public static void main(String args[])
  {
      int serialno,a;
      String fname;
      float cgpa;
      char grade;
      File f=null;
    try
    {
       f = new File("file.txt");
       FileWriter fout = new FileWriter(f);
       BufferedWriter bout = new BufferedWriter(fout);
       Scanner sc = new Scanner(System.in);
       do
       {
          System.out.println("Enter the serial no.");
          bout.write(sc.next());
          bout.newLine();
          System.out.println("enter the First name");
          bout.write(sc.next());
          bout.newLine();
          System.out.println("Enter the cgpa");
          bout.write(sc.next());
          bout.newLine();
          System.out.println("Enter the grade");
          bout.write(sc.next());
          bout.newLine();
          System.out.println("Enter 0 to exit!");
          a = sc.nextInt();
       }while(a!=0);
  bout.close();



    }
   catch(Exception e)
    {
       e.printStackTrace();
    } 

  }    
}    
  


   