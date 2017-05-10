class Exam{
	private int phy, chem, mat, failed, invalid;
	private String Failedsubject;
	
	
	public void Physics (int P)
	{
		if (P>= 0 && P <= 150)
		{
			
			if (phy < 65)
			{
			failed++;
			Failedsubject = "Physics";			
			}		
		else
			phy = P;
		}
		else
		{
			invalid = 1;				
		}
		
		if (P > 150)
		{
			System.out.println("Invalid Physics Marks");
		}	
		}	

		
			
	public void Chemistry (int C)
	{
		if (C>= 0 && C <= 150)
		{			
			if (C < 65)
			{
			failed++;	
			Failedsubject += ", Chemistry";			
			}
			else
				chem = C;
		}		
		else
			invalid++;	

if (C > 150)
		{
			System.out.println("Invalid Chemistry Marks");
		}		
	}
	
	public void Maths (int M)
	{
		if (M>= 0 && M <= 150)
		{
			
			if (mat < 65)
				{
					failed++;					
					Failedsubject += ", Maths";	
				}
				else
					mat = M;
		}
		else
			invalid++;
		
		if (M > 150)
		{
			System.out.println("Invalid Maths Marks");
		}
			
		
	}
	

public void ShowResult()
{
	int total;
	float percent;
	total = phy + chem + mat;
	percent = (float)total / 450 * 100;
	
	if (failed == 0)
	{	
	System.out.println("Total Marks:" + total);
	System.out.println("Percentage:" + percent);
	}
	else if(failed == 1)
	System.out.println("Retake the exam");
	else if(failed == 2)
	System.out.println("Repeat the course");
	else if(failed == 3)
	System.out.println("Go home my friend");
	 
		
}
}

class TOB2
{
	public static void main(String x[])
	{
	
		Exam Peter = new Exam();
	
		Peter.Maths(-1);
		Peter.Chemistry(3);
		Peter.Physics(70);		
		
	
		Peter.ShowResult();
	}
}