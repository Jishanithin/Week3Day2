package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSecondLargest {

	public static void main(String[] args) {
	
		int[] data = {3,2,11,4,6,7};
		List<Integer>alist=new ArrayList<Integer>();
		for(Integer each:data) {
			alist.add(each);
		}
		
		 Collections.sort(alist);
		System.out.println("Sorted list are: " + alist);
	int size=alist.size();
		System.out.println(" The Second Largest number is : " +alist.get(size-2));
		
		
	}

}
