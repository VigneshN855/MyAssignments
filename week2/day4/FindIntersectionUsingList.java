package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		
		List<Integer> ar1= new ArrayList<Integer>();
		List<Integer> ar2= new ArrayList<Integer>();
		
		for(Integer ls1: array1) {
			ar1.add(ls1);
		}
		
		for(Integer ls2:array2) {
			ar2.add(ls2);
		}
		
		Collections.sort(ar1);
		System.out.println("The integers in List 1 are "+ar1);
		
		Collections.sort(ar2);
		System.out.println("The integers in List 2 are "+ar2);
		
		System.out.println("=========== Now finding the intersection ============");
		
		for(int i=0; i<ar1.size();i++) {
			for(int j=0; j<ar2.size(); j++) {
				if(ar1.get(i).equals(ar2.get(j))) {
					System.out.println(ar1.get(i)+" equals to "+ar2.get(j));
				}
			}
		}
	}
}
