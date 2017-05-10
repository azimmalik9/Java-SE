class shop{
//float one_p = 0.01f; float two_p=0.02f; float five_p=0.05f; float ten_p=0.10f; float twenty_p = 0.20f; float fifty_p=0.50f; float one_pound=1f; float two_pound=2f; float  5 = 5f; float  10=10f; float  20=20f; float 50=50f;


float returnedChange;
public void money(float bill, float paid)
{	
	float returnedChange;
	float change = paid-bill;
	
	if (change >= 50)
	{		
		returnedChange = (int) change/50;		 
		System.out.println("50 pounds: " + returnedChange);
		change -= (returnedChange * 50);
	}
	
	if (change >= 20)
	{		
		returnedChange = (int) change/20;		 
		System.out.println("20 pounds: " + returnedChange);
		change -= (returnedChange * 20);
	}
	
	if (change >= 10)
	{		
		returnedChange = (int) change/10;		 
		System.out.println("10 pounds: " + returnedChange);
		change -= (returnedChange * 10);
	}
	
	if (change >= 5)
	{		
		returnedChange = (int) change/5;		 
		System.out.println("5 pounds: " + returnedChange);
		change -= (returnedChange * 5);
	}
	
	if (change >= 2)
	{		
		returnedChange = (int) change/2;		 
		System.out.println("2 pounds: " + returnedChange);
		change -= (returnedChange * 2);
	}
	
	if (change >= 1)
	{		
		returnedChange = (int) change/1;		 
		System.out.println("1 pounds: " + returnedChange);
		change -= (returnedChange * 1);
	}
	
	if (change >= 00.50)
	{		
		returnedChange = (int) (change/00.50f);		 
		System.out.println("fifty pence: " + returnedChange);
		change -= (returnedChange * 0.50);
	}
	
	if (change >= 00.20)
	{		
		returnedChange = (int) (change/00.20f);		 
		System.out.println("twenty pence: " + returnedChange);
		change -= (returnedChange * .20);
	}
	
	if (change >= 00.10)
	{		
		returnedChange = (int) (change/00.10f);		 
		System.out.println("ten pence: " + returnedChange);
		change -= (returnedChange * 0.10);
	}
	
	if (change >= 00.05)
	{		
		returnedChange = (int) (change/00.05f);		 
		System.out.println("five pence: " + returnedChange);
		change -= (returnedChange * 00.05);
	}
	
	if (change >= 00.02)
	{		
		returnedChange = (int) (change/00.02f);		 
		System.out.println("two pence: " + returnedChange);
		change -= (returnedChange * 00.02);
	}
	
	if (change >= 00.01)
	{		
		returnedChange = (int) (change/00.01f);		 
		System.out.println("one pence: " + returnedChange);
		change -= (returnedChange * 00.01);
	}
	System.out.println(bill - paid);
}
}

class change{
public static void main(String x[])
{
	shop s = new shop();
	s.money(50.50f, 191.20f);
}
}