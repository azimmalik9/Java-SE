class Test{

public void add(int num){
	int a, b;
	a = num/10;
	b = num%10;
	System.out.println(a + b);
}

}

class main{
{
	public static void main(String x[])
	{
	Test t = new Test();
	t.add(23);
	}
}