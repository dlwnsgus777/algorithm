package QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		List<Integer> testArr = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			testArr.add(i, random.nextInt(100));
		}
		System.out.println(testArr.toString());
		System.out.println(qsort(testArr).toString());;
	}
	
	public static List<Integer> qsort(List<Integer> list) {
		if (list.size() <= 1) {

			return list;
		}

		int pivot = list.get(0);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();

		
		for (int i = 1; i < list.size(); i++) {
			if (pivot > list.get(i)) {
				left.add(list.get(i));
			} else {
				right.add(list.get(i));
			}
		}

		result.addAll(qsort(left));
		result.add(pivot);
		result.addAll(qsort(right));

		return result;
	}

}
