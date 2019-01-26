class Date
{
int day;
int year;
int month;

Date(int d, int m, int y)
 {
this.day=d;
 this.month=m;
this.year=y;
}

	void DisplayDate()
	{
		System.out.print(day+" "+month+" "+year+" ");
	}
}
