class Exam{
	private int phy, chem, mat, count;
	
	
	public void Physics (int A)
	{
		if (A < 151)
		{
			phy = A;
			if (phy < 65)
			{
			count++;			
			}
		}
		else
			System.out.println("Invalid Physics Marks");
		
		
	}
	public void Chemistry (int A)
	{
		if (A < 151)
		{
			chem = A;
			if (chem < 65)
			{
			count++;			
			}
		}		
		else
			System.out.println("Invalid Chemistry Marks");
		
		
		
	}
	public void Maths (int A)
	{
		if (A < 151)
		{
			mat = A;
			if (mat < 65)
				{
					count++;					
				}
		}
		else
			System.out.println("Invalid Maths Marks");
	}
	

public void ShowResult()
{
	int total;
	float percent;
	total = phy + chem + mat;
	percent = (float)total / 450 * 100;
	
	if (count == 0)
	{	
	System.out.println("Total Marks:" + total);
	System.out.println("Percentage:" + percent);
	}
	else if(count == 1)
	System.out.println("Retake the exam");
	else if(count == 2)
	System.out.println("Repeat the course");
	else if(count == 3)
	System.out.println("Go home my friend");
	 
		
}
}

class TOB1
{
	public static void main(String x[])
	{
	
		Exam Peter = new Exam();
	
		Peter.Maths(885);
		Peter.Chemistry(678);
		Peter.Physics(7680);
		Peter.Maths(0);
		
	
		Peter.ShowResult();
	}
}