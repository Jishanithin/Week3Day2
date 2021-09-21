package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignMissingElementUsingCollections {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> ListArr1 = new ArrayList<Integer>();

		for(int i=0;i<arr.length-1;i++) {
			ListArr1.add(arr[i]);
			
	}

Collections.sort(ListArr1);
System.out.println("The sorted lists are : " + ListArr1 );
for(int i=1;i<arr.length-1;i++) {
int j=ListArr1.get(i-1);
	if(i!=j)
{
	System.out.println("Missing Element is " +i);
break;
}
}
}
}