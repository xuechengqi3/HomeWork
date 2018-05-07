package com.java;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入任意六个数:");
		int[] room = new int[6];
		for (int num = 0; num < room.length; num++) {
			room[num] = scanner.nextInt();
		}
		for (int num = 0; num < room.length; num++) {
			System.out.println(room[num]);
		}
	}
}
