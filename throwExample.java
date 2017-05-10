class MyException extends Exception{
	
}

class MyMath{
	public float Division(int a, int b) throws MyException
	{
		float c=0;
		if (b>a)
		{
		MyException e = new MyException();
			 throw e;
		}
		c = (float)a/b;
		return c;
	}
}

class throwExample{
	public static void main (String args[])
	{
		
		MyMath m = new MyMath();
		try
		{
		System.out.println(m.Division(7,2));
		}
		catch (MyException x){
			System.out.println("Do not do this");
		}
	}
}