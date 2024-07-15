package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr = {3, 2, 11, 4, 6, 7};
		
		List<Integer> arr1 = new ArrayList<Integer>();
		
		for(Integer ls1 : arr) {
			arr1.add(ls1);
		}
		
		Collections.sort(arr1);
		System.out.println("After Sorting: "+arr1);
		
		System.out.println("====================== Now finding the second largest number ========================");
		
		int size = arr1.size();
		int SecondLargest = arr1.get(size-5);
		System.out.println("The second Largest Number is "+SecondLargest);
	}

}
