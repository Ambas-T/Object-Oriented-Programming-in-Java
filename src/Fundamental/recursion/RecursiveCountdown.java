package Fundamental.recursion;

public class RecursiveCountdown {
	public static void main(String[] args) {
		countDown(9);
		System.out.println(findSum1ToN(3));
	}

	private static void countDown(int num) {
		if (num <= 0) {
			System.out.println("\nEnd");
		} else {
			System.out.print(num);
			countDown(num - 1);
		}
	}
	
	private static int findSum1ToN(int n) {
		if(n == 0)
		{
			return 0;
		}else 
		{
			return n + findSum1ToN(n - 1);
		}
	}
} 

