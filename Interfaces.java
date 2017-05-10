abstract class Shape{
	abstract void getArea();
}

interface Renderable{
	public void draw();
}

class Rectangle extends Shape 
implements Renderable{
	private int height = 20;
	private int width = 25;
	
	public void draw(){
		System.out.println("Render the thingy");
	}
	void getArea(){
		System.out.println("Area" + height * width);		
	}
}

class Interfaces{
	public static void main (String x[])
	{
		Rectangle r = new Rectangle();
		
		r.draw();
		r.getArea();
	}
}

