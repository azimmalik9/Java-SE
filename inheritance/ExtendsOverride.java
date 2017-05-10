class Math{
	public void Addition(int A, int B){
		int C;
		C = A + B;
		System.out.println(C);
	}
	public void Subtraction(int A, int B){
		int C = A-B;
		System.out.println(C);
	}
}

class Math2 extends Math{
	public void Additon(int x, int y){
		int c = x+y;
		System.out.println("Result=" + c);
	}
}

class ExtendsOverride {	
	public static void main (String x[]){
		Math2 m = new Math();
		m.Addition(5,7);			
		}
	}
