package KruskalAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class KruskalAlgorithmPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 그래프 구현
		int[][] mygraph = {
				{7, 0, 1},
				{5, 0, 3},
				{7, 1, 0},
				{9, 1, 3},
				{8, 1, 2},
				{7, 1, 4},
				{8, 2, 1},
				{5, 2, 4},
				{5, 3, 0},
				{9, 3, 1},
				{7, 3, 4},
				{6, 3, 5},
				{7, 4, 1},
				{5, 4, 2},
				{7, 4, 3},
				{8, 4, 5},
				{9, 4, 6},
				{6, 5, 3},
				{8, 5, 2},
				{11, 5, 6},
				{9, 6, 4},
				{11, 6, 5},
		};
		int[] vertices = {0, 1, 2, 3, 4, 5, 6};
		kuskal(mygraph, vertices);
	}
	
	public static void kuskal(int[][] graph, int[] vertices) {
		ArrayList<int[]> mst = new ArrayList<>();
		int[] parent = new int[vertices.length];
		int[] rank = new int[vertices.length];
		
		// 초기화
		for (int i = 0; i < vertices.length; i++) {
			parent[i] = vertices[i];
			rank[i] = 0;
		}
		
		Arrays.sort(graph, new Comparator<int[]>() {
			
			public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            } 
		});
		
		for (int i = 0; i < graph.length; i++) {
			int weight = graph[i][0];
			int node1 = graph[i][1];
			int node2 = graph[i][2];

			if (find(node1, parent) != find(node2, parent)) {
				union(node1, node2, rank, parent);
				mst.add(new int[]{weight, node1, node2});
			}
		}
		
		for (int i = 0; i < mst.size(); i++) {
			int[] mstList = mst.get(i);
			System.out.println("간선정보 : " + mstList[0] + ", " + mstList[1] + ", " + mstList[2]);
		}
		
	}
	
	public static int find(int node, int[] parent) {
		if (parent[node] != node) {
			parent[node] = find(parent[node], parent);
		}
		return parent[node];
	}
	
	public static void union(int node1, int node2, int[] rank, int[] parent) {
		int root1 = find(node1, parent);
		int root2 = find(node2, parent);
		
		if (rank[root1] > rank[root2]) {
			parent[root2] = root1;
		} else {
			parent[root1] = root2;
			
			if (rank[root1] == rank[root2]) {
				rank[root2] += 1;
			}
		}
	}

}
