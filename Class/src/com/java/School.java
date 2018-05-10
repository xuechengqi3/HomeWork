package com.java;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] room = new int[7];
		Scanner scanner = new Scanner(System.in);
		// 从控制台输入
		System.out.println("请输入任意七个数:");
		for (int num = 0; num < room.length; num++) {
			room[num] = scanner.nextInt();
		}
		room = bubbleSort(room);
		for (int num = 0; num < room.length; num++) {
			System.out.print(room[num] + " ");
		}
	}

	private static int[] bubbleSort(int[] room) {
		// TODO Auto-generated method stub
		for (int x = 0; x < room.length - 1; x++) {
			for (int y = 0; y < room.length - x - 1; y++) {
				if (room[y] > room[y + 1]) {
					int temp = room[y];
					room[y] = room[y + 1];
					room[y + 1] = temp;
				}
			} 
		}
		return room;
	}
}
