package CommunityMember;

public class Employee extends CommunityMembers { //define class name and extends superclass
	private int age; // define int and double parameter
	private double salary;
	public Employee(String name, int age, double salary) { // this is constructor method
		super(name); // call the superclass
		this.age=age; // define initial values of age
		this.salary=salary; } // define initial values salary and close the method
	public int getAge() { //you can get age 
		return age; } // return age and close this method
	public void setAge(int age) { // you can set age
		this.age=age; } // set age value and close this method
	public double getSalary() { // get salary
		return salary; } // return salary and close method
	public void setSalary(double salary) { // set salary
		this.salary=salary; } // set salary and close the method
} // close this class