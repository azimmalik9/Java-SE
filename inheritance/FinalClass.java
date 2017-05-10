final class Math{
	public void Addition(int x, int y)
	{
		int c = x + y;
		System.out.println(c);
	}
}

class Math2 extends Math{
	
}

class FinalClass{
	public static void main (String x[]){
		Math m = new Math();
		m.Addition(7,5);
	}
}