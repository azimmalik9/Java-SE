class Accounts
{
	public void VAT(){
		System.out.println("20%");
	}
	public void VAT(int salary){
		float Tax = salary*20.0F/100;
		System.out.println("VAT =" + Tax);
	}
	public void VAT(int salary, float t){
		float tax = salary * t/100;
		System.out.println("VAT ="+ tax);
	}
}

class tabs{
	public static void main(String xyz[])
	{
		Accounts QA = new Accounts();
		QA.VAT();
		QA.VAT(1000, 25.7F);
		QA.VAT(1000);
	}
}