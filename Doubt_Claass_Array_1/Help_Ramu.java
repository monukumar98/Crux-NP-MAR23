package Doubt_Claass_Array_1;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int nor = sc.nextInt();// number of rickshaws
			int noc = sc.nextInt();// number of cab
			int[] rickshaw = new int[nor];
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw[i] = sc.nextInt();
			}
			int[] cab = new int[noc];
			for (int i = 0; i < cab.length; i++) {
				cab[i] = sc.nextInt();
			}
			System.out.println(Minruppees(c1, c2, c3, c4, rickshaw, cab));
		}

	}

	public static int Minruppees(int c1, int c2, int c3, int c4, int[] rickshaw, int[] cab) {
		int ans1 = 0;// rickshaw
		int ans2 = 0;// cab
		for (int i = 0; i < rickshaw.length; i++) {
			ans1 += Math.min(rickshaw[i] * c1, c2);
		}
		ans1 = Math.min(ans1, c3);
		for (int i = 0; i < cab.length; i++) {
			ans2 += Math.min(cab[i] * c1, c2);
		}
		ans2 = Math.min(ans2, c3);
		return Math.min(c4, ans1 + ans2);
	}

}
