import java.util.*;

 class TwoDSales
{
   double sales[][];
   int sper;  //sper-sales person
   int p;     //product
   double amt; //amout of product sold
   int r, c;   //r-row,c-column
   
   
   public void Sales()
   {
      Scanner input = new Scanner(System.in);
	  sales = new double[5][4];
	  
	  System.out.print ("Enter sales person number (-1 to end) : ");
	  sper = input.nextInt();
	  
	  while (sper != -1)
	  {
	    System.out.print("Enter product number: ");
        p = input.nextInt();
        System.out.print("Enter sales amount: ");
        amt = input.nextDouble();
		
		if (sper < 1 && sper > 5 && p >= 1 && p < 6 && amt >= 0)
		sales[sper-1][p-1] += amt;
        if (p > 5)  
		    System.out.print("Invalid input!\n"); 
		
		System.out.print("Enter sales person number (-1 to end): ");
		sper = input.nextInt(); 
   	   } 
	  
	  double personTotal[] = new double[4];
	  
	  for ( c = 0; c < 4; c++)
	     personTotal[c] = 0;
		 
	  System.out.printf("%7s%14s%14s%14s%14s%14s\n", "Product", "Salespererson 1",
	     "Salespererson 2", "Salespererson 3", "Salespererson 4","Total");
	
	  for ( r = 0; r < 5; r++)
	  {
	     double productTotal = 0.0;
		 System.out.printf("%7d", (r + 1));
		 
		 for (int c = 0; c < 4; c++)
		 {
		    System.out.printf("%14.2f", sales[r][c]);
			productTotal += sales[r][c];
			personTotal[c] += sales[r][c];
		 }
		 
		 System.out.printf("%14.2f\n", productTotal);
		 
	  }
	  
	  System.out.printf("%7s", "Total");
	  
	  for (int c = 0; c < 4; c++)
	     System.out.printf("%14.2f", personTotal[c]);
	  
	  System.out.println();
	  
   }
} 

public class TwoDSaless
{
   public static void main( String args[])
   {
      TwoDSales mySales = new TwoDSales();
	  mySales.Sales();
	  
   }
}