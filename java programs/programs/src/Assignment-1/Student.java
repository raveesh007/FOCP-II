class Student 
{
	String firstName, lastName, eMail, contactNo;
	Address addr;
	Date dob;
	String[] skills;
	Qualification[] qual;
	Project[] projects;

	Student(String fn, String ln, String em, String cn, String l1, String l2, String c, String s, int p, int d, int m, int y, int x, String skill[], int v, Qualifications quali[], int b, Project proj[])
	{
		Scanner input = new Scanner(System.in);
		int j;
		firstName=fn;
		lastName=ln;
		eMail=em;
		contactNo=cn;
		addr=new Address(l1,l2,c,s,p);
	    dob=new Date(d,m,y);
	    skills=new String[x];
	    //System.out.println("enter skills");
	    for(j=0;j<x;j++)
	    {
	    	skills[j]=skill[j];
	    }
	    qual=new Qualification[v];
	    //String q, u, i;
	    //double cgpa;
	    for(j=0;j<v;j++)
	    {
	    	//System.out.println("enter qualName, university, institute, cgpa of number "+(j+1)+" Qualification");
	    	//q=input.next();
	    	//u=input.next();
	    	//i=input.next();
	    	//cgpa=input.nextDouble();
	    	qual[j]=quali[j];
	    }
	    projects= new Project[b];
	    String n, r;
	    String resp[];
	    int ds, ms, ys, dl, ml, yl, z;
	    for(j=0;j<b;j++)
	    {
	    	System.out.println("enter name, role, no. of responsibilities, startday, startmonth, startyear, finishday, finishmonth, finishyear of project number "+(j+1));
	    	n=input.next();
	    	r=input.next();
	    	z=input.nextInt();
	    	ds=input.nextInt();
	    	ms=input.nextInt();
	    	ys=input.nextInt();
	    	dl=input.nextInt();
	    	ml=input.nextInt();
	    	yl=input.nextInt();
	    	projects[j] = new Project(n,r,ds,ms,ys,dl,ml,yl,z);
	    }
	}

	void DisplayStudent(int x, int v, int b)
	{
		int j;
		System.out.print(firstName+" "+lastName+" "+eMail+" "+contactNo+" ");
		for (j=0;j<x;j++)
		{
			System.out.print(skills[j]+" ");
		}
		addr.DisplayAddress();
		dob.DisplayDate();
		for (j=0;j<v;j++)
		{
			qual[j].DisplayQualification();
		}
		for (j=0;j<b;j++)
		{
			projects[j].DisplayProject(projects[j].getz());
		}
	}
}

