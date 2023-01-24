package CommunityMember;

public class Teacher extends Faculty { // define class and extends superclass
	private String gender,field,secondField,ExamMethod,courseTechnique; //define string parameters
	private int courseNumber,examNumber,courseHours; 
	//constructor method
	public Teacher(String name, int age, double salary,String graduatedSchool,String oldWork, int workDaysNumber, double award,String gender,String field, String secondField,String ExamMethod,String courseTechnique,int courseNumber,int examNumber,int courseHours ) {
		super(name,age,salary,graduatedSchool,oldWork,workDaysNumber,award); // call the superclass method
		this.gender=gender; //define gender initial values 
		this.field=field; } //close constructor method
	public String getGender() { // you can get gender with this method
		return gender; } // return gender and close method
	public void setGender(String gender) { // you can set gender with this method 
		this.gender=gender; } // set gender and close the method
} // close this class
