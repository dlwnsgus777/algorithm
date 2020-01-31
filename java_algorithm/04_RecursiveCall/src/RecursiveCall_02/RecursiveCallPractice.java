package RecursiveCall_02;

import java.util.Arrays;

public class RecursiveCallPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiple = multiple(5);
		System.out.println("multiple number = " + multiple);
		int[] intArr = {1, 2, 3, 4, 5};
		int sumNumber = sumNumber(intArr);
		System.out.println("sum number = " + sumNumber);
		
		System.out.println("tomato는 회문인가?  " + palindrome("tomato"));
		System.out.println("level는 회문인가?  " + palindrome("level"));
	}
	
	public static int multiple(int num) {
		if (num <= 1) {
			return num;
		} else {
			return num * multiple(num - 1);
		}
	}
	
	public static int sumNumber(int[] num) {
		if (num.length <= 1) {
			return num[0];
		} else {
			return num[0] + sumNumber(Arrays.copyOf(num, num.length - 1));
		}
		
	}
	
	public static Boolean palindrome(String str) {
		if (str.length() <= 1) {
			return true;
		} 
		
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return palindrome(str.substring(1, str.length() - 1));
		} else {
			return false;
		}
	}
}
