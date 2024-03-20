package ops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employeee emp1 = new Employeee();
		
		emp1.Name = "Naresh";
		emp1.EmployeeId = 234567;
		emp1.Salary = 2000;
		
		Employeee emp2 = new Employeee();
		
		emp2.Name = "Amit";
		emp2.EmployeeId = 435267;
		emp2.Salary = 3000; */
		
		 
		
		/*Employeee emp1 = new Employeee("Naresh",234567,2000);
		Employeee emp2 = new Employeee("Amit",435267,3000);
		emp1.PrintName();
		emp2.PrintName();*/
		Employeee emp3 = new Employeee("Samar",435987);
		
		Employeee.ChangeCompanyName();
		//emp3.PrintName();
		
		person per1 = new person();
		
		Child child1 = new Child("Rahul",30,"Doctor");
		//child1.display();
		//child1.print();
		
		MethodOverloding obj = new MethodOverloding();
		obj.sum(4, 7);
		obj.sum(4, 6, 9);
		
		ICICIBank bank1 = new ICICIBank();
		bank1.Creditcard();
		bank1.Welcome();
		
		CapsuationExmple obj10 = new CapsuationExmple();
		obj10.setName("Rohit");
		System.out.println(obj10.getName());
		

	}

}

	
	
