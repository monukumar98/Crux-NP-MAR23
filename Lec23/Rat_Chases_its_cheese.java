package Lec23;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		ratmaze(maze, 0, 0, ans);
		if (flag == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean flag = false;

	public static void ratmaze(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			flag = true;
			Display(ans);
		}
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
//		ratmaze(maze, cr - 1, cc, ans);// up
//		ratmaze(maze, cr + 1, cc, ans);// down
//		ratmaze(maze, cr, cc - 1, ans);// left
//		ratmaze(maze, cr, cc + 1, ans);// right
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };
		for (int i = 0; i < c.length; i++) {
			ratmaze(maze, cr + r[i], cc + c[i], ans);
		}
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();

		}

	}

}
