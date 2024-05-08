package com.example.answer;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		int[] ary = new int[50];

		int inputCount = 0; // 入力した回数
		int total = 0; // 入力した数字の合計

		Scanner s = new Scanner(System.in);
		System.out.println("数字を入力してください");

		do {
			ary[inputCount] = s.nextInt();
			total = total + ary[inputCount];
			inputCount = inputCount + 1;
		} while (total < 100);

		for (int i = 0; i < inputCount; i++) {
			System.out.print(ary[i] + " ");
		}
		// 入力を終了する。
		s.close();
	}
}