package FinalExam;

public class Gazi extends Triangle {
	private int base, height;
	public Gazi(String color, int base, int height) { 
		super(color, base, height);
	    this.base = base; 
	    this.height = height;
	}
	@Override
	public String toString() {
		return "Gazi[base="+base+",height="+height;
	}
	@Override
	public double getArea() { 
		return 0.5*base*height;
	}
}