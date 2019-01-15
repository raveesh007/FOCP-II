import java.util.Scanner;

public class TwoDArray
{
   public static void main(String args[])
   {
	   
       int i,j,row,col;
       int arr[][] = new int[10][10];
       Scanner scan = new Scanner(System.in);
	   
       
       System.out.print("Enter row for the array (max 10) : ");
       row = scan.nextInt();
       System.out.print("Enter column for the array (max 10) : ");
       col = scan.nextInt();
	   
       
       System.out.println("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
	   
       
       System.out.print("The Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
      System.out.println("after modification the  Array is : ");
      for(i=0;i<row;i++)
      {
          for(j=0;j<col;j++)
          {
              if(arr[i][j]%2==0)
              {
                 System.out.print(arr[i][j]+ "  ");
              }
              else
              {
                 System.out.print((arr[i][j]*2)+ "  ");
              }       
          }
        System.out.println();
      }   
   }
}