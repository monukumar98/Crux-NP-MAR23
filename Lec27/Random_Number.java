package Lec27;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int lo = 10;
		int hi = 190;
		for (int i = 0; i < 10; i++) {
			int num = rn.nextInt(hi - lo + 1) + lo;
			System.out.println(num);

		}

	}

}
