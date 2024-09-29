package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFindMissingElement {

	public static void main(String[] args) {
		int[] num={1, 2, 3, 4, 10, 6, 8};
		int length=num.length;
		
		List<Integer> missingNumber=new ArrayList<Integer>();
		
		for(int i=0;i<length;i++) {
			missingNumber.add(num[i]);
		}
		Collections.sort(missingNumber);
		int size=missingNumber.size();
		int largestNum=missingNumber.get(size-1);

		System.err.println("Given Numbers are : "+missingNumber);
		boolean hello=false;
		System.out.println("The Missing Numbers are :");
		for(int i=1;i<=largestNum-1;i++) {
				for(int j=0;j<size-1;j++) {
					hello=false;
					if(i==missingNumber.get(j)) {
						break;
					}
					else{
						hello=true;
					}
				}
				if(hello) {
					System.out.println(i);
				}
				
				
		}
			
		
	}

}
