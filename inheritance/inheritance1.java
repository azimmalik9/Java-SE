class UK{
	int a,b;
	public void Message(){
		System.out.println("hello");
		System.out.println(a);
		System.out.println(b);
	}
}

class ABC extends UK{
	
}

class inheritance1{
	public static void main (String x[]){
		ABC Ref = new ABC();
		Ref.a = 15;
		Ref.b = 12;
		Ref.Message();
	}
}