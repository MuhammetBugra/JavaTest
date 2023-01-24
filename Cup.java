package tryCatch;

public class Cup {
	protected int k; 
	static int m=0; 
	private int array[]; 
	public Cup() {
	    array=new int[10];
	}
	public void wash() { 
		System.out.println("Washing a Cup.");
	}
    public void printK() { 
	    System.out.println(this.k+"\n"+array[m]+0/2);
    }
	public void sumAll() { 
		m--;
	    int a=0;
	    int n=1; 
	    try {
	    	n=5/a;
	    }
	    catch (ArithmeticException ae) { 
	    	System.out.println("ArithmeticException occured!"); 
	    	n++;
	    }
	    finally {
	        n--;
	        System.out.println(n);
	    }
	    System.out.println(n);
    }
}