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
		System.out.println("Merge Sort Àü : " + testArr.toString());
		testArr = mergeSplit(testArr);
		System.out.println("Merge Sort ÈÄ : " + testArr.toString());
	}
	
	public static List<Integer> mergeSplit(List<Integer> list) {
		if (list.size() == 1) {
			return list;
		}		
		
		int medium = list.size() / 2;
		List<Integer> left = mergeSplit(list.subList(0, medium));
		List<Integer> right = mergeSplit(list.subList(medium, list.size()));
		
		return merge(left, right);
	}
	
	public static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> merge = new ArrayList<Integer>();
		int left_point = 0;
		int right_point = 0;
		
		while (left.size() > left_point && right.size() > right_point) {
			if (left.get(left_point) > right.get(right_point)) {
				merge.add(right.get(right_point));
				right_point += 1;
			} else {
				merge.add(left.get(left_point));
				left_point += 1;
			}
		}
		
		while (left.size() > left_point) {
			merge.add(left.get(left_point));
			left_point += 1;
		}
		
		while (right.size() > right_point) {
			merge.add(right.get(right_point));
			right_point += 1;
		}
		
		return merge;
	}

}
