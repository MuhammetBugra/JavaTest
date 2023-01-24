package InheritanceAndPolymorpsym;

public class Program 
{
	public static void main(String[] args) 
	{
		PermanentEmployee hakan = new PermanentEmployee("Kayra", 20000D);
		hakan.SetSalary(21000D);
		Intern buse = new Intern("Buse");
		Consultant ahmet = new Consultant("Ahmet", 10000D);
		
		Employee.PromotionCoefficent = 0.05;
		
		// System.out.println(hakan.fullName); => private 
		
		System.out.printf("Kadrolu personel %s, yıllık maaşı %.2f\n", hakan.GetFullName(), hakan.ReportYearlyBudget());
		System.out.printf("Stajyer %s, yıllık maaşı %.2f\n", buse.GetFullName(), buse.ReportYearlyBudget());
		System.out.printf("Danışman %s, yıllık maaşı %.2f\n", ahmet.GetFullName(), ahmet.ReportYearlyBudget());
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.printf("%s için yıllık promosyon : %.2f\n", hakan.GetFullName(), hakan.GetPromotion());
		System.out.printf("%s için yıllık promosyon : %.2f\n", buse.GetFullName(), buse.GetPromotion());
		System.out.printf("%s için yıllık promosyon : %.2f\n", ahmet.GetFullName(), ahmet.GetPromotion());
	}
}
