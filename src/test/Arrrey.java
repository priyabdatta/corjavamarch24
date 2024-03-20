package test;

public class Arrrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {20,40,50,60};
		System.out.println("The total numbers of values are " + num1.length);
		System.out.println("Value at 3 position is " + num1[2]);
		System.out.println("Value at last position is " + num1[ num1.length-1] );
		
		String[] name1 = {"abc","cde","fgh"};
		System.out.println("value at 3 position is " + name1[2]);
		
		String name = "Clean India Green India love India";
		String[] arrwords = name.split(" ");
		System.out.println("The totals num of words is " + arrwords.length);
		System.out.println("the value at last position is " + arrwords[ arrwords.length-1]);
		System.out.println("The value at 3rd position is " + arrwords[2]);

	}

}
