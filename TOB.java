class Exam{
	private int phy, chem, mat;
	
	public void Physics (int A)
	{
		if (A < 151)
			phy = A;
		else
			System.out.println("Invalid Physics Marks");
	}
	public void Chemistry (int A)
	{
		if (A < 151)
			chem = A;
		else
			System.out.println("Invalid Chemistry Marks");
	}

public void ShowResult()
{
	int total;
	float percent;
	total = phy + chem;
	percent = (float)total / 300 * 100;
	System.out.println("Total Marks:" + total);
	System.out.println("Percentage:" + percent);
}	
}

class TOB
{
	public static void main(String x[])
	{
		Exam James = new Exam();
		James.Physics(140);
		James.Chemistry(140);
		James.ShowResult();
	}
}