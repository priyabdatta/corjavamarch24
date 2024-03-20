package ops;

public class Employeee {
	
	public String Name;
	public int EmployeeId;
	public static int Salary = 1000;
	public static String CompanyName = "Infosys";
	
	public Employeee(String Name,int EmployeeId,int Salary) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
	}
	
	public Employeee(String Name,int EmployeeId) {
		
	}
		public void PrintName() {
			
		
		
		System.out.println("Name of the employeee is " + this.Name);
	}
		public void PrintSalary() {
			
			System.out.println("Salary of the employee is " + Employeee.Salary);
		}
		public void PrintCompanyName() {
			
			System.out.println("Name of the Company " + Employeee.CompanyName	);
		}
		
		public static void ChangeCompanyName() {
			
			Employeee.CompanyName = "Wipro";
			System.out.println("The compant name change to " + Employeee.CompanyName);
			
		}

}
