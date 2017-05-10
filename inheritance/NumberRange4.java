class Assignment4{
public void range(int start, int end){
	for(int i =start; i<=end; i++){
	
		if (i % 2 == 0)
		{
			for(int evenRange =1; evenRange<=i; evenRange++){
				System.out.print(evenRange);
				
			}
		}
		
		
		else
		{
		
			for(int oddRange =i; 1<=oddRange; oddRange--){
				System.out.print(oddRange);
			}
		
		
		
	}
	System.out.print("\n");
}
}
}


class NumberRange4 {
	public static void main (String xyz[]){
		Assignment4 r = new Assignment4();
		r.range(1,20);
	}
}