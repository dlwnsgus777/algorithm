package BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] testArr = new int[50];
		for (int i = 0; i < 50; i++) {
			testArr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(testArr));
		bubbleSort(testArr);
		System.out.println(Arrays.toString(testArr));
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Boolean swap = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false) {
				break;
			}
		}
	}
}


