class Assignment3{
public void range(int start, int end) {
	for(int i =start; i<=end; i++){
	
		if (i % 2 == 0)
		{
			for(int evenRange =0; evenRange<=i; evenRange++){
				System.out.print(evenRange);
			}
		}
		else
		System.out.println("\n" + i);
		
	}

}
}

class NumberRange3{
	public static void main (String xyz[])
	{
		Assignment3 x = new Assignment3();
		x.range(1,20);
	}
}
	