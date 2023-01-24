package InheritanceAndPolymorpsym;

public class Intern extends Employee 
{
	public Intern(String fullName)
	{
		super(fullName, 1000D);
	}
	
	public Double GetPromotion() // override => bak super Employee (polymorphism)
	{
		return this.GetSalary(); // bir aylık maaş 
	}
}
