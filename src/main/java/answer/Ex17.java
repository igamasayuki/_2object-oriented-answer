package answer;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.println(i + 1 + "番目の数字");
			num[i] = s.nextInt();
		}

		// 1.10 個の整数の入力を受け取り配列に格納したあとに、入力された数値を 2 倍にして出力してください。
		System.out.println("①");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] * 2 + " ");
		}

		System.out.println();

		// 2.①の処理に続けて、配列に入力された数値を偶数と奇数に分けて表示してください。
		// 表示のしかた（例）：
		// 偶数：42 54 32 8
		// 奇数：7 35 71 13 21 45
		System.out.println("②");
		System.out.print("偶数：");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}

		System.out.println();

		System.out.print("奇数：");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				System.out.print(num[i] + " ");
			}
		}
		
		// 入力を終了する。
		s.close();
	}
}