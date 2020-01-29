package InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] testArr = new int[10];
		for (int i = 0; i < testArr.length; i++) {
			testArr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(testArr));
		insertionSort(testArr);
		System.out.println(Arrays.toString(testArr));
	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		
	}
}
