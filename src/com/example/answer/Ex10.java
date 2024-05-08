package com.example.answer;

public class Ex10 {
	public static void main(String[] args) {

		int numbers[] = { 5, 6, 1, 3, 9 };

		// 1.配列の 4 番目の要素を表示してください。
		System.out.println(numbers[3]);

		// 2.繰り返しを使って、配列の値を 1 番目から 5 番目の順に全て表示してください。
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		// 3.繰り返しを使って、配列の値の 5 番目から 1 番目の順に全て表示してください。
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		// 4.繰り返しを使って、配列の値から奇数だけ表示してください。
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();

		// 5.配列の値に、偶数の値が何個あったかを表示してください。
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

		// 6.最大値と最小値を表示させてください。
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("最大値：" + max + "/最小値：" + min);
	}
}
