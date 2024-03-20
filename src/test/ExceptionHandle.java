package test;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int []array1 = {5,56,7,68};
		try {
			//int result = num/0;
			System.out.println(array1[10]);
		}catch(ArithmeticException e) {
			System.out.println("Inside ArthimeticException");
			
		}catch(Exception e) {
			System.out.println("Inside catch the block");
		}
		System.out.println("after try and catch");
	}
	


}


