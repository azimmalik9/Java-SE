class Test42{
	static int a;
	public static void message(){
		a=15;
		System.out.println("static method \n" + a);		
	}
	
	public void message2(){
		System.out.println("non-static method \n" + a);
	}
}

class StaticMethod{
	public static void main (String xyz[]){
		Test42.a;
		
		Test42 x = new Test42();				
		x.message();
		x.message2();
	}
}