package Fundamental.recursion;

public class FindLengthOfString {
	public static void main(String[] args) {
		System.out.println(lengthOfString("1234"));
		System.out.println(reverseString("Ambasa"));
	}
	
	private static int lengthOfString(String str) {
		if(str.isEmpty())
		{
			return 0;
		}else
		{
			return 1 + lengthOfString(str.substring(1));
		}
	}
	
	private static String reverseString(String str) {
		if(str.isEmpty())
		{
			return "";
		}else
		{
			int len = str.length();
			return Character.toString(str.charAt(len -1)).concat(reverseString(str.substring(0, len - 1)));
		}
	}
} 

