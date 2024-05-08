package com.example.answer;

public class Ex19 {
	public static void main(String[] args) {
		int kuku[][] = new int[9][9];

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				kuku[i - 1][j - 1] = i * j;
			}
		}

		for (int row[] : kuku) {
			for (int answer : row) {
				if (answer < 10) {
					System.out.print(" ");
				}
				System.out.print(answer + " ");
			}
			System.out.println();
		}
	}
}