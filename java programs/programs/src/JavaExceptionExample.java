import java.util.*;
import java.lang.*;

public class JavaExceptionExample
{

	public static void main(String args[]){

	try
	{
	int n;
	n=100/0;
	}catch(ArithmeticException a){System.out.println(a);}
	System.out.println("rest of the code");
	}
}