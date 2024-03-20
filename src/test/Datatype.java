package test;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 20;
		int num2 = 30;
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		float div = (float)num1/num2;
		String result = "The sum of the two numbers is" + sum;
		System.out.println(result); 
		System.out.println("The subtraction of two numbers is " + sub);
		System.out.println("The multiply of two numbers is " + mul);
		System.out.println("The division of two numbers is " + div);
		
		String name = "Clean India Green India";
		System.out.println("Total number of the charters are " + name.length());
		
		char char1 = name.charAt(1); 
		char char2 = name.charAt(name.length()-1);
		System.out.println("char at 2 position is " + char1);
		System.out.println("the char at last position is "+ char2);
		System.out.println("the string in uppercase " + name.toUpperCase());
		System.out.println( name.toLowerCase());
		
		String[] arrwords = name.split(" ");
		System.out.println("The total number of words are " + arrwords.length);
		System.out.println("Value at third position is " + arrwords[2]);

		
	}

}
