package week3day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsIntersection {

	public static void main(String[] args) {
		int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> alist1 = new ArrayList<Integer>();
		List<Integer> alist2 = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			alist1.add(arr1[i]);
			alist2.add(arr2[i]);

		}

		alist1.retainAll(alist2);
		System.out.println("The intesection numbers are: " + alist1);

	}
}