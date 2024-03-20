package ops;

public class Child extends person {
	String Profession;
	
	public Child() {
		
	}
	
	public Child(String Name,int Age,String Profession) {
		super(Name,Age);
		this.Profession = Profession;
		
		System.out.println("The name age and profession of the child is" );
	}
		
	
		
		
		
		
		
		public void print() {
		
		
		System.out.println("Inside Child");
		
	}

}
