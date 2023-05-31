package Arrays_2D_doubt_Class;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int l = sc.nextInt();
		int[] rank = new int[l];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = sc.nextInt();
		}
		Arrays.sort(rank);
		System.out.println(mintime(rank, p));
	}

	public static int mintime(int[] rank, int p) {
		int hi = 0;
		hi = rank[rank.length - 1] * (p * (p + 1) / 2);
		int lo = 0;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(rank, p, mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		return ans;

	}

	public static boolean isitpossible(int[] rank, int p, int mid) {
		// TODO Auto-generated method stub
		int tp = 0;
		int cp = 1;
		int time = 0;
		int i = 0;
		while (i < rank.length) {
			if (time + cp * rank[i] <= mid) {
				time += cp * rank[i];
				tp++;
				cp++;
			} else {
				i++;
				time = 0;
				cp = 1;
			}
			if (tp == p) {
				return true;
			}
		}

		return false;
	}

}
