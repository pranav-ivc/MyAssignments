package week1.day4;

public class FindEvenNumbers {

		public void evenNumber(int range) {
			
			for (int i=0;i<=range;i++) {
				if (i%2==0) {
					System.out.print(i+" ");
				}
			}
		}

		public static void main(String[] args) {
			int maxRange=20;
			FindEvenNumbers even=new FindEvenNumbers();
			System.out.println("Below are the odd numbers of maxRange 10");
			even.evenNumber(maxRange);

		}


	}

