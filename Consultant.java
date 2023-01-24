package InheritanceAndPolymorpsym;

public class Consultant extends Employee 
{
	public Consultant(String fullName, Double salary)
	{
		super(fullName, salary * 0.9);
	}
}
