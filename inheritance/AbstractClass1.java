abstract class Math{
	abstract public void Addition(int a, int b);
	abstract public void Subtraction(int a, int b);
	public void divide(int a, int b){
		float c = a/b;
		System.out.println(c);
	}
}

class Math2 extends Math{
	 public void Addition(int a, int b){
		int c = a+b;
			System.out.println(c);
	}
	public void Subtraction(int a ,int b){
		int c = a-b;
			System.out.println(c);
	}
}

class Math3 extends Math{

}

class AbstractClass1{
	public static void main (String x[]){
		Math3 m = new Math3();
		//m.Addition(2,2);
		//m.Subtraction(2,2);
		m.divide(5,2);
	}
}