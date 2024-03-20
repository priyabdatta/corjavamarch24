package test;

public class ReverseExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Clean India Green India";
		
		String revStr1 = "";
		for(int index=str1.length()-1;index>=0;index--) { 
			revStr1 = revStr1 + str1.charAt(index);
			
			
		
		System.out.println("reversing string " + revStr1);
		}
	

		int[]arry1 = {10,20,40,50,60};

	for(int index=arry1.length-1;index>=0;index--) {
		System.out.println(arry1[index]);
	}
	int num5 = 452356;
	int rev = 0;
	while(num5>0) {
		int remainder = num5%10;
		rev = rev*10 + remainder;
		num5 = num5/10;
		
	}
	
	System.out.println("The reverse value is " + rev);
}
}
	
					