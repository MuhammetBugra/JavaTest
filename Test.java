package UserInheritance;

public class Test {
	public static void main(String[] args) {
		User user=new User(false);
		Customer customer=new Customer(false, "Buğra", "abc", "b@gmail.com", "1234 5678", 0);
		Admin admin=new Admin(false, "Muhammet", "m@gmail.com");
		System.out.println("Test class worked"); }
}
