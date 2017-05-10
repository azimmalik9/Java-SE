class Math
{
public void Addition(int x, int y)
{
	int c;
	c= x+y;
	System.out.println("Result: " + c);
}


public void Subtract(int x, int y)
{
	int c;
	c= x-y;
	System.out.println("Result: " + c);
}


public void Multiply(int x, int y)
{
	int c;
	c= x*y;
	System.out.println("Result: " + c);
}


public void Divide(int x, int y)
{
	int c;
	c= x/y;
	System.out.println("Result: " + c);
}
}

class Calc{
	
	public static void main(String x[])
	{
		Math m = new Math();
		m.Addition(2,2);
		m.Subtract(2,2);
		m.Multiply(2,2);
		m.Divide(2,2);
	}
}