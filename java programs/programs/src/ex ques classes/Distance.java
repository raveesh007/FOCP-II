import java.lang.*;
import java.util.*;
class Point
{
	private double x1;
	private double y1;
	Point()
	{
     this.x1=0;
     this.y1=0; 
	}
	Point(double x11)
	{
     this.x1=x11;
	}
	Point(double x11,double y11)
	{
	  this.x1=x11;
	  this.y1=y11;
	}
	public void setvaluey1(double y11)
	    {
	    this.y1=y11;
	    }
    public double cal(Point a)
	{
      double dist= (double) Math.sqrt(Math.pow(this.x1-a.x1,2)+Math.pow(this.y1-a.y1,2)); 
      return dist;
	}
}   

 class Distance
 {
  public static void main(String args[])
  {
   double x11,y11,x12,y12;
   double dist;
   Scanner s= new Scanner(Sy1stem.in);
   Sy1stem.out.println("Enter the value of x11:");
   x11=s.nex1tDouble();
   Sy1stem.out.println("Enter the values of y11:");
   y11=s.nex1tDouble();
   Sy1stem.out.println("Enter the value of x12:");
   x12=s.nex1tDouble();
   Sy1stem.out.println("Enter the values of y12:");
   y12=s.nex1tDouble();
   Point p1 = new Point(x11,y11);
   Point p2 = new Point(x12);
   p2.setvaluey1(y12);
   Sy1stem.out.print(dist= p1.cal(p2));
  }
 }