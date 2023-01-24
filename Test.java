package FinalExam;

public class Test {
	public static void main(String[] args) { 
		Shape s1 = new Rectangle("red", 4, 5); 
		System.out.println(s1);
	    System.out.println("Area is " + s1.getArea());
	    
	    Shape s2 = new Triangle("blue", 4, 5); 
	    System.out.println(s2); 
	    System.out.println("Area is " + s2.getArea());
	    
	    Ankara s3 = new Ankara("yellow", 2, 6); 
	    System.out.println(s3); 
	    System.out.println("Area is " + s3.getArea());
	    
	    Gazi s4 = new Ankara("brown", 3, 5); 
	    System.out.println(s4); 
	    System.out.println("Area is " + s4.getArea()); 
	    
	    Ankara s5 = new ODTU("red", 2, 9); 
	    System.out.println(s5); 
	    System.out.println("Area is " + s5.getArea());
	}
}