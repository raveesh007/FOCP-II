import java.util.*;
abstract class Figure {
double dim1;
double dim2;
Figure(double a, double b) {
dim1 = a;
dim2 = b;
}
// area is now an abstract method
abstract double area();
}
class Rectangle extends Figure {
Rectangle(double a, double b) {
super(a, b);
}
// override area for rectangle
double area() {
System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
              }
}
class Dimensions {
	public static void main (String args[])
	{
    double D1;
	double D2;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter dimension 1");
	D1=obj.nextDouble();
	System.out.println("Enter the dimension 2");
	D2=obj.nextDouble();
	Rectangle R = new Rectangle(D1,D2);
	double a= R.area();
	System.out.println("The area is" + a );
    }
}