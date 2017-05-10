class Math{
	public void ADD(int A, int B){
		System.out.println(A+B);
	}
	public void SUB(int A, int B){
		System.out.println(A-B);
	}
}

class QA extends Math{
	public void DIV(int A, int B)
	{
		System.out.println(A/B);
	}
}

class ParentReference{
	public static void main (String x[]){
		Math R;
		R = new QA();
		//DIV(4,2);
		R.ADD(7,2);
		R.SUB(7,2);
	}	
}