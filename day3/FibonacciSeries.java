package week1.day3;

public class FibonacciSeries {
	
	public void fibonacci(int range) {
		int a=0;
		int b=1;
		int c = 0;
		for (int i = 1; i <= range; i++)  {
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		int range=8;
		FibonacciSeries value=new FibonacciSeries();
		System.out.println("Below are the Fibonacci series of range 8");
		value.fibonacci(range);
	}

}
