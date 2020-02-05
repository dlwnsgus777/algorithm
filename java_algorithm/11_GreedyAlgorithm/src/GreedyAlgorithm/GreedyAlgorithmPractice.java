package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class GreedyAlgorithmPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * 	동전 문제
		 *  [500, 100, 50, 1]의 동전을 최소한 사용해 4126원 만들기
		 */
		int[] coinList = {500, 50, 100, 1};
		minCoinCount(coinList, 4126);
		
		/**
		 *  배낭 문제
		 *  무게에 따른 가치를 생각해 가방 안에 꽉꽉 채우는 문제 가치는 나눌수 있다.
		 */
		
		System.out.println(" ");
		
		// {무게, 가치}
		int[][] bag = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
		maxValueItem(bag, 10);

	}
	
	public static void minCoinCount(int[] coinList, int value) {
		int[] coinSort = Arrays.stream(coinList)
				.boxed()
				.sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue)
				.toArray();
		HashMap<String, Integer> coinCount = new HashMap<String, Integer>();
		int result = 0;
		
		System.out.println(Arrays.toString(coinSort));
		
		for (int coin : coinList) {
			if (value == 0) {
				break;
			}
			int minCoinCount = value / coin;
			result += minCoinCount;
			value -= minCoinCount * coin;
			coinCount.put(Integer.toString(coin), minCoinCount);
		}
		
		System.out.println("Result : " + result);
		for (String key : coinCount.keySet()) {
			
			int resultValue = coinCount.get(key);
			System.out.println(key + " 원 : " + resultValue + " 개");
		}
	}
	
	public static void maxValueItem(int[][] bag, int weight) {
		Arrays.sort(bag, (cur, prev) -> {
			int prevValue = (prev[0] / prev[1]);
			int curValue = (cur[0] / cur[1]);
			if (curValue >= prevValue) {
				return -1;
			} else {
				return 1;
			}
			//return prevValue - curValue;
		});
		
		double maxValue = 0;
		HashMap<String, Double> itemCount = new HashMap<String, Double>();
		
		for (int i = 0; i < bag.length; i++) {
			int[] item = bag[i];
			
			
			if (weight - item[0] >= 0) {
				int insertValue = item[1];
				weight -= item[0];
				maxValue += insertValue;	
				itemCount.put(Integer.toString(item[0]), (double) 1);
			} else {
				double faction = (double) weight / item[0];
				double insertValue = item[1] * faction;
				maxValue += insertValue;	
				itemCount.put(Integer.toString(item[0]), insertValue);
				break;
			}
		}
		
		System.out.println("Result : " + maxValue);
		
		for (String key : itemCount.keySet()) {
			double resultValue = itemCount.get(key);
			System.out.println(key + " 무게 : " + resultValue + " 개");
		}
		
	}

}
