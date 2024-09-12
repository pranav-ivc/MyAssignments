package week1.day4;
import java.util.Arrays;
import java.util.Scanner;


public class MethodsInOneClass {

	//Fibonacci Series Method
	public void fibonacci(int range) {
		int a=0;
		int b=1;
		int c = 0;
		for (int i = 1; i <= range; i++) {
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
			
		}
	}
	
	//Find Odd Number Method
	public void oddNumber(int range) {
		
		for (int i=0;i<=range;i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}
		}
	}

	//Find Even Number Method
	public void evenNumber(int range) {
	
	for (int i=0;i<=range;i++) {
		if (i%2==0) {
			System.out.print(i+" ");
		}
	}
	}
	
	//Find Palindrome for given number
	public void palindromeNumber(int num) {
		int count =String.valueOf(num).length();
		int reverse=0,remainder,straight;
		straight=num;
			for (int i=0;i<count;i++) {
				remainder=num%10;
				reverse=(reverse*10)+remainder;
				num=num/10;
	 }
			System.out.println(straight);
			if(straight<0) {
				System.out.println("Given number "+straight+" is negative number and its Not palindrome");
			}
			else {
				if(straight==reverse)
				{
					System.out.println("Given number "+straight+" is palindrome");
				}
				else {
					System.out.println("Given number "+straight+" is Not palindrome");
				}
			}
		
	}
	
	//Find Duplictae value for given number
	
	public void findDuplicate(int[] num1) {
		Arrays.sort(num1);
		int num2[]=num1;
		int length=num1.length;	
		System.out.println("Duplicate values of given number are : ");
		for (int i=0; i<length;i++) {
			
			if(i+1==length) {
				break;
			}
			else if (num1[i]==num2[i+1]) {
				System.out.println(" "+ num2[i]);
			}
			
		}
	}
	
	//Find Intersection of given 2 integer arrays
	public void findMatching(int[] a, int[] b) {
		 int lengthA=a.length;
         int lengthB=b.length;
         if (lengthA==lengthB) {
        	 for (int i=0;i<lengthA;i++) {
        		 for (int j=0;j<lengthB;j++) {
        			 
        			 if(a[i]==b[j]) {
        				 System.out.println("There is a match from b and the values are "+a[i]);
        			 }
        		 }
        	 }
         }
	}
}
	
