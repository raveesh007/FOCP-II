import java.util.*;
class TenToHundred
{
	public static void main(String args[])
	{
	   int A[] = new int[5];
	   int flag=0;
	   Scanner s = new Scanner(System.in);
	   System.out.print("Enter values between 10 and 100");
	   for(int i=0;i<5;i++)
	    {
	      System.out.println("enter the no.");
          A[i]=s.nextInt();
          if(A[i]>+10 && A[i]<=100)
           {
              for(int j=0;j<=i;j++)
               {
               	 for(int a=0;a<=j;a++) 
               	 {
               	    if(A[j]==A[a])
               	    	flag=1;
                  }
                  if(flag==0)
                  {
                    System.out.print(" ");
                    System.out.print(A[j]);
                  }
               }

  
            }
           else 
           	System.out.println("your number entered is not in the limit mentioned");
	    }
	}    
}
