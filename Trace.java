package tryCatch;

public class Trace {
	public static void main(String[] args) {
		Cup c = new Cup(); 
		CoffeeCup cc = new CoffeeCup(); 
		CoffeeMug cm = new CoffeeMug(); 
		EspressoCup ec = new EspressoCup();
		try {
		    VirtualCafe.prepareACup(c); 
		    c.printK(); 
		    VirtualCafe.prepareACup(cc); 
		    VirtualCafe.prepareACup(cm);
		}
		catch(Exception ex) {
		    System.out.println("k"); 
		    System.out.println("k,m");
		}
		finally { 
			VirtualCafe.prepareACup(ec); 
			c.printK();
		}
	}
}