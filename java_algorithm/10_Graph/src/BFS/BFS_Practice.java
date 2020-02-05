package BFS;

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

		bfs(graph, "A");
	}
	
	public static ArrayList<String> bfs(HashMap<String, String[]> graph, String start_node) {
		ArrayList<String> visited = new ArrayList<String>();
		ArrayList<String> need_visited = new ArrayList<String>();
		
		need_visited.add(start_node);

		while (need_visited.size() > 0) {
			String node = need_visited.get(0);
			need_visited.remove(0);
			if (!visited.contains(node)) {
				visited.add(node);
				need_visited.addAll(Arrays.asList(graph.get(node)));
			}
		}
		
		System.out.println(visited.toString());
		return visited;
	}

}
