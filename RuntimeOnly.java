abstract class Drawing{
	abstract public void Draw();
}

class RuntimePolymorphism{
	public static void doDrawing(Drawing x)
	{
		x.Draw();
	}
	
	public static void main (String x[])
	{
		Line l = new Line();
		Circle c = new Circle();
		Square s = new Square();
		doDrawing(l);
		doDrawing(c);
		doDrawing(s);
	}
}

class Line extends Drawing{
	public void Draw(){
		System.out.println("I am drawing line");
	}
}

class Circle extends Drawing{
	public void Draw(){
		System.out.println("I am drawing circle");
	}
}

class Square extends Drawing{
	public void Draw(){
		System.out.println("I am drawing square");
	}
}