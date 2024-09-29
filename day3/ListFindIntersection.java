package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class ListFindIntersection {

	public static void main(String[] args) {
		
		int[] num1=  {3, 2, 11, 4, 6, 7};
		int[] num2=  {1, 2, 8, 4, 9, 7};
		
		int numLength1=num1.length;
		int numLength2=num2.length;
		
		List<Integer> intersectionNumbers=new ArrayList<Integer>();
		int sameNumber;
		
		for(int i=0;i<numLength1;i++) {
			for (int j=0;j<numLength2;j++) {
				if(num1[i]==num2[j]) {
					sameNumber=num1[i];
					intersectionNumbers.add(sameNumber);
				}
			}
		}
		System.out.println(" The Intersection Numbers are :"+intersectionNumbers);
 	}

}
