package InheritanceAndPolymorpsym;

public abstract class Employee 
{
	public static Double PromotionCoefficent = 0.1;
	private String fullName;
	private Double salary;
	
	public Employee(String fullName, Double salary)
	{
		this.fullName = fullName;
		this.salary = salary;
	}
	
	public String GetFullName()
	{
		return this.fullName;
	}
	
	public Double GetSalary()
	{
		return this.salary;
	}
	
	public void SetSalary(Double salary)
	{
		this.salary = salary;
	}
	
	public Double ReportYearlyBudget()
	{
		return this.GetSalary() * 12;
	}
	
	public Double GetPromotion()
	{
		return this.ReportYearlyBudget() * PromotionCoefficent;
	}
}
