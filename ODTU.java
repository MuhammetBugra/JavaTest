package FinalExam;

public class ODTU extends Ankara {
	private int base, height;
	public ODTU(String color, int base, int height) { 
		super(color, base, height);
	    this.base = base; 
	    this.height = height;
	}
	@Override
	public String toString() {
		return "";
		//return super.toString()+"ODTU[base="+base+",height="+height+((Gazi)this).toString();
	}
	@Override
	public double getArea() { 
		return 2*base*height;
	}
}