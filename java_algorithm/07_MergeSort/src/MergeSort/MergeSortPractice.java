package MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		List<Integer> testArr = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			testArr.add(i, random.nextInt(100));
		}
	}
	
	public static List<Integer> mergeSplit(List<Integer> list) {
		int medium = list.size() / 2;
		return list;
	}

}
