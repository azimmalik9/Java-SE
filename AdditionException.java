class AdditionException{
public static void main (String x[])
{
	int a,b,c;
	a=b=c=0;
	
	try
	{
		
		a=Integer.parseInt(x[0]);
		b=Integer.parseInt(x[1]);
		c=a/b;
		
		if (a <= 0 || b <= 0)
		{
			System.out.println("Please send only positive numbers");
		}
		else
		{
		System.out.println(c);
		}
	}
	catch(NumberFormatException e)
	{
		System.out.println("Please send only numberic values");
	}
	catch(ArithmeticException T)
	{
		System.out.println("Please do not try to divide any number by zero");
	}
	catch(ArrayIndexOutOfBoundsException T)
	{
		System.out.println("Please provide 2 numbers");
	}
}
}