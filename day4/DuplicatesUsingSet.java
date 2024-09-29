package week3.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesUsingSet {

	public static void main(String[] args) {
		String str="google";
		
		Set<Character> se=new LinkedHashSet<Character>();
		char[] character=str.toCharArray();
		int length=str.length();
		for(int i=0;i<length;i++) {
			se.add(character[i]);
			

		}
		System.out.println(se);

	}

}
