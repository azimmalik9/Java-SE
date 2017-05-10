class Bank{
	static int Dollar;
	
	public void SetDollar(int a){
		Dollar=a;
	}
	public void Amount(int amo){
		System.out.println(amo*Dollar);
	}
}

class StaticVar{
	public static void main (String x[])
	{
		Bank HSBC=new Bank();
		Bank Natwest=new Bank();
		
		HSBC.SetDollar(75);
		HSBC.Amount(2);
		Natwest.SetDollar(4);
		Natwest.Amount(100);
		
	}
}