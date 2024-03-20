package test;

public class loopexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1;
		
		while(num1<=10){
			if(num1 == 5) {
				num1 = num1 + 1;
				continue;
			}
			System.out.println(num1);
			num1 = num1+1;
		}
		
		for(int count=1;count<=10;count++) {
			if(count==5) {
				continue; //break;
			}
			System.out.println("inside for loop " + count);
			
			
		}
		for(int count=10;count>=1;count--) {
			System.out.println("the count value " + count);
		}
		int[] arry1 = {20,30,40,60};
		for(int value:arry1) {
			System.out.println(value);
		}

	}

}
