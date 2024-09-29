package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		String[] word={"HCL","Wipro","Aspire Systems","CTS"};
		int length=word.length;
		List<String> sorting=new ArrayList<String>();
		for(int i=0; i<length;i++) {
			sorting.add(word[i]);
		}
		Collections.sort(sorting);
		System.out.println("Before Reverse : "+sorting);
		Collections.reverse(sorting);
		System.out.println("After Reverse : "+sorting);
	}

}
