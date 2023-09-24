package Lec46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellManford {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManford(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1 se v2 ko connect kiya hai
	}

	class EdgePair {
		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}
	}

	public List<EdgePair> GetAllEdges() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;

	}

	public void BellMan_Algo() {
		List<EdgePair> ll = GetAllEdges();

		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 9999999;
		}
		for (int i = 1; i <= v; i++) {
			for (EdgePair e : ll) {
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve Wt ka cycle hai");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}

	public static void main(String[] args) {
		BellManford bfd = new BellManford(5);
		bfd.AddEdge(1, 2, 8);
		bfd.AddEdge(2, 5, -2);
		// bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.BellMan_Algo();
	}
}
