package DijkstraAlgorithm;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraAlgorithmPractice {
	public static final int inf = 99999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *      0'A':{'B': 8, 'C':1, 'D':2},
			    1'B':{},
			    2'C':{'B': 5, 'D':2},
			    3'D':{'E':3, 'F':5},
			    4'E':{'F':1},
			    5'F':{'A':5}
		 */
		
		// graph 구현
		int[][] myGraph = {
			{0, 8, 1, 2, inf, inf},
			{inf, 0, inf, inf, inf, inf},
			{inf, 5, 0, 2, inf, inf},
			{inf, inf, inf, 0, 3, 5},
			{inf, inf, inf, inf, 0, 1},
			{5, inf, inf, inf, inf, 0}	
		};
		
		int[][] testGraph = {
			{0, 2, 3, 5, inf},
			{2, 0, inf, inf, inf},
			{3, inf, 0, 1, 2},
			{5, inf, 1, 0, inf},
			{inf, inf, 2, inf, 0}
		};
		
		dijkstra(myGraph, 0);
		dijkstra(testGraph, 0);
	}
	
	public static void dijkstra(int[][] graph, int start) {
		int[] distance = new int[graph[0].length];	// 시작 노드부터 각 노드까지의 최소거리
		PriorityQueue<NeedVisist> need_visit = new PriorityQueue<NeedVisist>(new Comparator<NeedVisist>() {
			public int compare(NeedVisist n1, NeedVisist n2) {
				return n1.weight >= n2.weight ? 1 : -1;
			}
		});
		
		// 시작 지점 초기화
		for (int i = 0; i < distance.length; i++) {
			if (i == start) {
				distance[i] = 0;
			} else {
				distance[i] = inf;
			}
		}
		distance[start] = 0;
		NeedVisist needVisit = new NeedVisist(0, start, start); 
		need_visit.add(needVisit);
		
		while (!need_visit.isEmpty()) {
			int[] node = need_visit.poll().getConnect();
			
			if (distance[node[1]] < graph[node[0]][node[1]]) {
				continue;
			}
				
			
			for (int i = 0; i < graph[node[0]].length; i++) {
				int minDis = graph[node[1]][i] + graph[start][node[1]];

				if (minDis < distance[i]) {
					distance[i] = minDis;
					NeedVisist nv = new NeedVisist(minDis, node[1], i); 
					need_visit.add(nv);

				}
			}
			
		}
		
		System.out.println("==========================================");
		
		for (int i = 0; i < distance.length; i++) {
			System.out.print("distance: "  + distance[i] + "  ");
		}
		
		System.out.println("");
		System.out.println("==========================================");

	}

}

class NeedVisist {
	int weight;
	int[] connect = new int[2];
	
	public NeedVisist(int weight, int node, int connectNode) {
		this.weight = weight;
		connect[0] = node;
		connect[1] = connectNode;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int[] getConnect() {
		return this.connect;
	}

}
