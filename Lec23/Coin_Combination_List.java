package Lec23;

import java.util.*;

public class Coin_Combination_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amount = 5;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination(coin, amount, ll, 0, ans);
		System.out.println(ans);
	}

	public static void Combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combination(coin, amount - coin[i], ll, i, ans);
				ll.remove(ll.size() - 1);
			}

		}

	}
}
