package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DFS_Practice {

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
		
		dfs(graph, "A");
	}
	
	public static ArrayList<String> dfs(HashMap<String, String[]> graph, String start_node) {
		 ArrayList<String> visited = new  ArrayList<String>();
		 ArrayList<String> need_visit = new  ArrayList<String>();
		 
		 need_visit.add(start_node);
		 
		 while (need_visit.size() > 0) {
			 String node = need_visit.get(need_visit.size() - 1);
			 need_visit.remove(need_visit.size() - 1);
			 if (!visited.contains(node)) {
				 visited.add(node);
				 need_visit.addAll(Arrays.asList(graph.get(node)));
			 }
		 }
		 System.out.println(visited);

		 return visited;
	}

}
