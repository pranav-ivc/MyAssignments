package week1.day4;

public class PalindromeAssignment {

	public static void main(String[] args) {
		MethodsInOneClass pali=new MethodsInOneClass();
		int num=5445;
		int num1=-6767;
		int num2=45669;
		
		pali.palindromeNumber(num);
		System.out.println("---------------");
		
		pali.palindromeNumber(num1);
		System.out.println("---------------");
		
		pali.palindromeNumber(num2);
		System.out.println("---------------");

	}

}
