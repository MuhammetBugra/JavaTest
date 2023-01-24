package CommunityMember;

public class Test { // this is test class
	public static void main(String[] args) { // define main method
		CommunityMembers cm=new CommunityMembers(null); // test other class
		Employee e= new Employee(null, 0, 0);
		Faculty f= new Faculty(null, 0, 0, null, null, 0, 0);
		Teacher t=new Teacher(null, 0, 0, null, null, 0, 0, null, null, null, null, null, 0, 0, 0);
		System.out.println("test class worked"); } } // test write close this class