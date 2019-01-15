import java.util.Scanner;
public class Decimal
{
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("enter floating point no : ");
        double b = in.nextDouble();
        System.out.print("Input floating-pt. another no.: ");
        double c = in.nextDouble();

        b = Math.round(a * 1000);
        b = b / 1000;

        c = Math.round(b * 1000);
        c = c / 1000;

        if (b == c)
        {
            System.out.println("They are same up to 3 decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}      