package Fundamental.recursion;

public class MathimaticalExample {

	public static void main(String[] args) {
		System.out.println("Factorial -> " + factorial(4));
		System.out.println("Fibonacci -> " + fibonacci(4));
	}
	
	private static int factorial(int n) {
		if(n == 0 || n == 1)
		{
			return 1;
		}else {
			return n*factorial(n -1);
		}
	}
	
	private static int fibonacci(int n) {
		if(n == 0 || n == 1)
		{
			return n;
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
} 
