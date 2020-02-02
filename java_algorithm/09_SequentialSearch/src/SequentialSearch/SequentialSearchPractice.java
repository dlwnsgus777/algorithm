package SequentialSearch;

import java.util.Arrays;
import java.util.Random;

public class SequentialSearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < test.length; i++) {
			test[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(test));
		System.out.println(sequentialSearch(test, 20));
	}
	
	public static int sequentialSearch(int[] arr, int search) {
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				index = i;
				break;
			}
		}
		
		return index;
	}

}
