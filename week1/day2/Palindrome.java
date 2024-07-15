package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 355;
		int orgNum = num;
		int rev = 0;
		int rem;
		while(num!=0) {
			rem=num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		
		if(orgNum == rev) {
			System.out.println("Is Palindrome");
		}	else	{
			System.out.println("Not a Palindrome");
		}
	}
}
