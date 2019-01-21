import java.util.*;
class Date
{
	private int month;
    private int day;
    private int year;

	public void DisplayDate()
	{
     System.out.print(this.month);
     System.out.print("/");
     System.out.print(this.day);
     System.out.print("/");
     System.out.print(this.year);
	}
	Date(int a,int b,int c)
	{
		this.day=a;
		this.month=b;
		this.year=c;
	}
      Date()
      {
        this.day=1;
        this.month=1;
        this.year=2000;

}

class DateTest
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  Date d = new Date();
        d.DisplayDate();
	  int a=-1,b=-1,c=-1;
	  while(a<0 || a>31)
	   {
	     System.out.println("enter the date : ");
	     a=s.nextInt();
	   }
	  while(b<0 || b>12)
	   {
	  	 System.out.println("enter the month : ");
	     b=s.nextInt();
	   }
	  while(c<0)
	   {
	   	 System.out.println("enter the year : ");
	     c=s.nextInt();
	   }
	  
	  Date d1=new Date(a,b,c);
	  d.DisplayDate();
    }
}