package CommunityMember;

public class Faculty extends Employee { //define class name and extends superclass
	private String graduatedSchool,oldWork; //define string variables
	private int workDaysNumber; // define int values
	private double award;
	public Faculty(String name, int age, double salary,String graduatedSchool,String oldWork, int workDaysNumber, double award) { // this is constructor method
		super(name,age,salary); // call the superclass method
		this.workDaysNumber=workDaysNumber; // define initial variables
		this.graduatedSchool=graduatedSchool;
		this.oldWork=oldWork;
		this.award=award; } // close constructor method
	public String getGraduatedSchool() { // you can get grds
		return graduatedSchool; } //return and close this method
	public void setGraduatedSchool(String graduatedSchool) { // set grst
		this.graduatedSchool=graduatedSchool; } // set grds and close this method
} // close this class
