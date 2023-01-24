package FinalExam;

public class Ankara extends Gazi {
	private int base, height;
	public Ankara(String color, int base, int height) { 
		super(color, base, height);
	    this.base = base; 
	    this.height = height;
	}
	@Override
	public String toString() {
		return super.toString()+",Ankara[base="+base+",height="+height+","+this.getClass().getSuperclass().getSuperclass().getDeclaredMethods()+"]]]";
		//return super.toString()+",Ankara[base="+base+",height="+height+","+((Triangle)this).toString()+"]]]]";
	}
	@Override
	public double getArea() {
		return 0.5*base*height;
	}
}