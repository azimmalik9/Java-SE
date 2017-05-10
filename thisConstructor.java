class QAManchester{
	public QAManchester(){
		this(7);
		System.out.println("ABC");
	}
	
	public QAManchester(int A){
		this(8,9);
		System.out.println("London");
	}
	
	public QAManchester(int A, int B){
		System.out.println(123);
	}	
}

class thisConstructor{
	public static void main (String xyz[])
	{
		QAManchester x = new QAManchester();
	}
	
}