package Lec42;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(6);
		set.add(61);
		set.add(621);
		set.add(2);
		set.add(51);
		set.add(2);
		System.out.println(set);
//		System.out.println(set.contains(5));
//		System.out.println(set.contains(51));
//		System.out.println(set.remove(11));
//		System.out.println(set.remove(51));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(6);
		set1.add(61);
		set1.add(621);
		set1.add(2);
		set1.add(51);
		set1.add(2);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(6);
		set2.add(61);
		set2.add(621);
		set2.add(2);
		set2.add(51);
		set2.add(2);
		System.out.println(set2);
	}

}
