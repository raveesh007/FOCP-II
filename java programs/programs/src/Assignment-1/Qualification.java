class Qualification
{
	String qualName, university, institute;
	double cgpa;

	Qualification(String a, String b, String c, double cgpa)
	{
		this.qualName=a;
		this.university=b;
		this.institute=c;
		this.cgpa=cgpa;
	}

	void DisplayQualification()
	{
		System.out.print(qualName+" "+university+" "+institute+" "+cgpa+" ");
	}
}

class Project
{
	String name, role;
	String responsibilities[];
	Date startDate,endDate;
	int z;

	Project(String n,String r, int ds, int ms, int ys, int dl, int ml, int yl, int z, Project proj[])
	{
		int i;
		Scanner input = new Scanner(System.in);
	this.name=n;
	this.role=r;
	startDate= new Date(ds,ms,ys);
	endDate= new Date(dl,ml,yl);
	this.z=z;	
	this.responsibilities=new String[z];
	System.out.println("enter responsibilities");
	for(i=0;i<z;i++)
	{
		this
		this.responsibilities[i]=resp[i];
	}
	}

	void DisplayProject(int z)
	{
		int i;
		System.out.print(name+" "+role+" ");
		startDate.DisplayDate();
		System.out.print(" ");
		endDate.DisplayDate();
		System.out.print(" ");
		for (i=0;i<z;i++)
		{
			System.out.print(responsibilities[i]+" ");
		}
	}

	int getz()
	{
		return z;
	}
}
