package test;

import java.util.Scanner;

public class numbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("even number");
		}else {
			System.out.println("number is odd");
		}
		scanner.close();
	}

}
