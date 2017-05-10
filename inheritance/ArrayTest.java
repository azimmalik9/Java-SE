class Arrays{
	public void InsertArray(){
	int[] anArray = new int[10];
	
		for (int i = 0; i< anArray.length; i++)
		{
			anArray[i] = (i+1)*100;
			System.out.println(anArray[i]);
		}
	}
}

class ArrayTest{
	public static void main (String x[]){
	Arrays input = new Arrays();
	input.InsertArray();
	}
}
