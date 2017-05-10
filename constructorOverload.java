class QA{
	public QA(){
		System.out.println("hello");
	}
	public QA (int A, int B){
		System.out.println("ABC");
	}
}

class constructorOverload{
public static void main (String xyz[]){
	QA x = new QA();
	QA y = new QA(6,7);
}
}