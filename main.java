class Test{

public void addOne(int num){
	int a, b, c;
	a = num/100;
	b = (num/10)%10;
	c = num%10;
	System.out.println(a + b + c);
}
public void addTwo(int num){
	int a, b, c;
	a = num/100;
	b = (num/10)%10;
	c = num%10;
	System.out.println(a + b + c);
}
public void addThree(int num){
	int a, b, c;
	a = num/100;
	b = (num/10)%10;
	c = num%10;
	System.out.println(a + b + c);
}
public void addFour(int num){
	int a, b, c;
	a = num/100;
	b = (num/10)%10;
	c = num%10;
	System.out.println(a + b + c);
}

}

class main{
	public static void main(String x[])
	{
	Test t = new Test();
	t.addFour(2355);
	}
}