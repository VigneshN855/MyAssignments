package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> arr = new ArrayList<String>();
		for(String ls: array) {
			arr.add(ls);
		}
		
		Collections.sort(arr);
		System.out.println("After Sorting: "+arr);
		
		System.out.println("============================Now Resversing the string===========================");
		
		List<String> revlist = new ArrayList<String>();
		
		for(int i=arr.size()-1;i>=0;i--) {
			revlist.add(arr.get(i));
		}
		System.out.println("After Reversing ArrayList :" +revlist);
	}
}
