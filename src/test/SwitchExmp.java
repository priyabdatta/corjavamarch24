package test;

import java.util.Scanner;

public class SwitchExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = scanner.nextLine();
		int vovelCount = 0;
		for(int index=0;index<str1.length();index++) {
			
			char temp = str1.charAt(index);
			switch(temp) {
			case'a':
			case'i':
			case'e':
			case'o':
			case'u':
				vovelCount = vovelCount+1;
				break;
				
				
			}
		}
		
		System.out.println("Total number of vovel " + vovelCount); 
	}

}
