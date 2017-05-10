public class Rectangle extends Shape 
implements Renderable{
	private int height = 20;
	private int width = 25;
	
	public void draw(){
		System.out.println("Render the thingy");
	}
	public void getArea(){
		System.out.println("Area" + height * width);		
	}
}