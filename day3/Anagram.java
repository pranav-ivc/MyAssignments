package week3.day3;

import week1.day4.MethodsInOneClass;

public class Anagram extends MethodsInOneClass{

	public static void main(String[] args) {
			
		Anagram an=new Anagram();
		an.anagramMethod("stops", "potss");
		an.anagramMethod("skkps", "potss");
		an.anagramMethod("skkps", "pktss");
		an.anagramMethod("stops", "potss");
		
	}

}
