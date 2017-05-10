class Test{
int a, b;
public int Sum(){
	int c = a + b;
	System.out.println(c);
}

}

class result
{
	public static void main(String x[])
	{
	Test t = new Test();
	t.a(5);
	t.b(2);
	t.Sum();
	}
}