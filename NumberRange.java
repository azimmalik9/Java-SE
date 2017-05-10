class Assignment1{
public void range(int start, int end) {
	
	if (start == end)
	{
	for(int i =start; i<=end; i++){
			System.out.print(i+"- "); 
				if (i % 2 == 0){
				System.out.println(" even");}
				else 
					System.out.println(" odd");
		}
	}
	
		for(int i =start; i<=end; i++){
			System.out.print(i+"- "); 
				if (i % 2 == 0)
					System.out.println(" even");
				else 
					System.out.println(" odd");
		}
	
	
	
		for(int i =start; i>=end; i--){
			System.out.print(i+"- "); 
				if (i % 2 == 0)
					System.out.println(" even");
				else 
					System.out.println(" odd");
		}
}
}
	

class NumberRange{
public static void main (String xyz[]){
Assignment1 x = new Assignment1();
x.range(11,11);
}
}