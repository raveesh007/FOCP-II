import java.util.*;
//Scanner in = new Scanner(System.in);

class Box
{
	double width,height,depth;
	void Dimensions()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("input the Dimensions");
		width=in.nextDouble();
		height=in.nextDouble();
		depth=in.nextDouble();
	}
	double volume()
	{
		double vol=width*height*depth;
		return vol;
	}
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		double vol2;
		b1.setDim();
		vol2=b1.volume();
		System.out.println("Volume is "+vol2);
	}
}