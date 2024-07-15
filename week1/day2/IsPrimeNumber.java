package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
//		if(num%2==0) {
//			System.out.println("The given number "+num+" is a Prime number");
//		} else{
//			System.out.println("The given number "+num+" is not a Prime number");
//		}
		
		for(int i = 0; i<=num; i++) {
			if(i%2!=0) {
				System.out.println("The given number "+i+" is a Prime number");
			} else{
				System.out.println("The given number "+i+" is not a Prime number");
			}
		}
		
	}

}
