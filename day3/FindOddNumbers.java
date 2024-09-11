package week1.day3;

public class FindOddNumbers {
	
	public void oddNumber(int range) {
		
		for (int i=0;i<=range;i++) {
			if (i%2==1) {
				System.out.print(i+", ");
			}
		}
	}

	public static void main(String[] args) {
		int maxRange=10;
		FindOddNumbers odd=new FindOddNumbers();
		System.out.println("Below are the odd numbers of maxRange 10");
		odd.oddNumber(maxRange);

	}

}
