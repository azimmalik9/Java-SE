class Tree{
	int A,B;
	
	public void what(){
		int A, C;
		this.A = 15;
		C=15;
	}
	
	public void message(){
		System.out.println("A ="+A);
		System.out.println("B ="+B);		
		
	}
}

class thisObject{
	public static void main (String xyz[]){
		Tree x = new Tree();
		x.what();
		x.message();
	}
}