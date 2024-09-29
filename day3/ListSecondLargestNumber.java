package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSecondLargestNumber {

	public static void main(String[] args) {
		
		int[] num1= {3, 2, 11, 4, 6, 7};
		int length=num1.length;
		Arrays.sort(num1);
		
		List<Integer> secondLargest=new ArrayList<Integer>();
		for(int i=0;i<length;i++) {
			secondLargest.add(num1[i]);
		}
		
		System.out.println("Second Largest number is :"+secondLargest.get(length-2));
		

	}

}
