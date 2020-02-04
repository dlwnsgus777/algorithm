package BFS;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFS_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그래프 구현
		HashMap<String, String[]> graph = new HashMap<String, String[]>();
		graph.put("A", new String[] {"B", "C"});
		graph.put("B", new String[] {"A", "D"});
		graph.put("C", new String[] {"A", "G", "H", "I"});
		graph.put("D", new String[] {"B", "E", "F"});
		graph.put("E", new String[] {"D"});
		graph.put("F", new String[] {"D"});
		graph.put("G", new String[] {"C"});
		graph.put("H", new String[] {"C"});
		graph.put("I", new String[] {"C", "J"});
		graph.put("J", new String[] {"I"});
		ArrayList<String> arr = new ArrayList<String>();
		
		for (String key : graph.keySet()) {
			String[] value = graph.get(key);
			System.out.println(key + Arrays.toString(value));
			arr.addAll(Arrays.asList(value));
		}
		
		System.out.println(arr.toString());
	}

}
