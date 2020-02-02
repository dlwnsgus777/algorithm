package BinarySearch;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < test.length; i++) {
			test[i] = random.nextInt(100);
		}
		
		System.out.println(Arrays.toString(test));
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
		System.out.println(binarySearch(test, 18));
	}
	
	
	public static Boolean binarySearch(int[] arr, int search) {
		if (arr.length == 1 && arr[0] == search) {
			return true;
		}
		
		if (arr.length == 1 && arr[0] != search) {
			return false;
		}
		
		int medium = arr.length / 2;
		
		if (search == arr[medium]) {
			return true;
		}
		
		if (search < arr[medium]) {
			return binarySearch(Arrays.copyOfRange(arr, 0, medium), search);
		} else {
			return binarySearch(Arrays.copyOfRange(arr, medium, arr.length), search);
		}
	}

}
