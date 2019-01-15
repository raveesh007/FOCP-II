import java.util.*;
public class Arrayindexwithfunction{
	int selement;
	int i=0;
	Scanner scan=new Scanner(System.in);
	int element[]=new int[10];
	int flag=-1;

	void enterelements()
	{
	    System.out.println("enter 10 elements in array");
	    for(i=0; i<10;i++)
	    {
	        element[i]=scan.nextInt();
	    }

	}
void displayelement()
{
	System.out.println("the following elements were entered in array");
	    for(i=0; i<10;i++)
	    {
	        System.out.println(element[i]);

	    }
}
void checkelement(int aa)

{
for(i=0; i<10;i++)
{if(element[counter]==selement)
    {flag=1;
    break;
}
else
{
	flag = -1;
}

}
if(flag == 1)
{
	System.out.println("elements"+element[i]+"found at position"+(i+1));
}
else
{
	System.out.println("elements not found"+flag);
}	
}

public static void main(String[] args)
{
	
	int selement;
	Arrayindexwithfunction  f= new Arrayindexwithfunction();
	f.enterelements();

	System.out.print("enter the element you want to find");
	Scanner scan= new Scanner(System.in);
	selement=scan.nextInt();

	f.displayelement();
	f.checkelement(selement);


}

}