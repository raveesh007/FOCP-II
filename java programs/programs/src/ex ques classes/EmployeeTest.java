import java.util.*;
class Employee 
{
  private String fname;
  private String lname;
  private double sal;
  Employee()
    {
     double a =-1;
     Scanner s = new Scanner(System.in);
     System.out.print("\nFirst name : ");
     this.fname= s.nextLine();
     System.out.print("\nLast name : ");
     this.lname= s.nextLine();
     while(a<0)
        {
         System.out.print("\nmonthly Salary (enter a positive value) : ");
         a=s.nextDouble();
         this.sal= a;
        }
      
    }
  public double getsal()
  {
    return this.sal;
  }

}

class EmployeeTest
{  
public static void main(String args[])
  {  
     System.out.print("\nenter the info for employee 1 ");
     Employee e1 = new Employee();
     System.out.print("\nenter the info for employee 2 ");
     Employee e2 = new Employee();
     System.out.print("\nThe yearly salary of employee 1 is : ");
     System.out.print(12*e1.getsal());
     System.out.print("\nThe yearly salary of employee 2 is : ");
     System.out.print(12*e2.getsal());
     System.out.print("\nAFTER A RISE OF 10% IN THEIR SALARY.... \n");
     System.out.print("\nThe yearly salary of employee 1 is : ");
     System.out.print((12*e1.getsal()/10)+(12*e1.getsal()));
     System.out.print("\nThe yearly salary of employee 2 is : ");
     System.out.print((12*e2.getsal()/10)+(12*e2.getsal()));
   }
 }