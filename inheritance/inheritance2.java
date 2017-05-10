class Math{
	public void Addition(int a, int b){
		int c;
		c = a+b;
		System.out.println("Result=" +c);
	}
	public void Subtraction(int a, int b){
		int c;
		c = a+b;
		System.out.println("Result="+c);
	}
}

class Math2 extends Math{
	public void Multiplication(int x, int y){
		int c;
		c=x*y;
		System.out.println(c);
	}
	public void Division(int a, int b){
		int c;
		c=a/b;
		System.out.println(c);
	}
}

class Math3 extends Math2{
	public void Modulus(int a, int b){
	int c;
	c=a%b;
	System.out.println("complicated math thingy" + c);
	}
}

class inheritance2{
	public static void main (String x[]){
		Math3 m = new Math3();
		m.Addition(7,5);
		m.Subtraction(10,5);
		m.Multiplication(7,7);
		m.Division(9,8);
		m.Modulus(3,5);
	}
}