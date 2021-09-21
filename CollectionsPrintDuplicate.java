package week3day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsPrintDuplicate {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> ListArr1 = new ArrayList<Integer>();
for(int i=0;i<arr.length-1;i++) {
	ListArr1.add(arr[i]);
}


for(int i=0;i<arr.length-1;i++) {

	int i1= ListArr1.get(i);
	
	for(int j=i+1;j<arr.length-1;j++) {
		
		int j1=ListArr1.get(j);
		if(i1==j1) {
			System.out.println("Duplicate numbers are : " + i1);
			break;
		}
	}
}
		
	}	
	}


