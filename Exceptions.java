class Exceptions{
	
	public static void main (String xyz[])
	{
		int a,b,c;
		a=4;
		b=0;	
		c=0;			
		
		try
		{
			c=a/b;			
		}
		catch (IndexOutOfBoundsException x)
		{
			System.out.println("should not reach this message");
		}
		catch (ArithmeticException x)
		{
			System.out.println("Please do not divide by zero");
		}
		System.out.println(c);
		
		
		
	}
}