package SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] testArr = new int[5];
		for (int i = 0; i < testArr.length; i++) {
			testArr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(testArr));
		selectionSort(testArr);
		System.out.println(Arrays.toString(testArr));
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int lowest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[lowest] > arr[j]) {
					lowest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[lowest];
			arr[lowest] = temp;
		}
	}

}
