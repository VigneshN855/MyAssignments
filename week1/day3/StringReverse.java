package week1.day3;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Animal is a movie";
		char[] charArray = name.toCharArray();
		int len = charArray.length;
		
		for(int i=len-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}

	}

}
