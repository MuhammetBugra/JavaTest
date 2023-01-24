package CommunityMember;

public class CommunityMembers { // define class name
	private String name; // define string variable
	public CommunityMembers(String name) { // this is constructor method
		this.name=name; } // define initial value of the name
	public String getName() { // you can get name with this method
		return name; } // return name and close the get method
	public void setName(String name) { // you can set name with this method
		this.name=name; } // set name parameter and close the set method 
} // close this class
