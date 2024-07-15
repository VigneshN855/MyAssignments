package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange=10;
		for(int i =1; i<=maxRange;i++) {
			if(i%2==1) {
				System.out.println("The number "+i+" is an even number");
			}	else	{
				System.out.println("The number "+i+" is a odd number");
			}
		}
	}

}
