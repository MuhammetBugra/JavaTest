package FinalExam;

public class Shape {
	private String color;
	public Shape (String color) { 
		this.color = color;
	}
	@Override
	public String toString() {
	    return "Shape[color=" + color + "]";
	}
	/* All shapes must provide a method called getArea() */ 
	public double getArea() {
	    System.err.println("Shape unknown! Cannot compute area!"); 
	    return 0;
	}
}