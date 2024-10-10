package com.example.answer;

public class Ex16 {
	public static void main(String[] args) {

		// (1)要素数が5個のint型配列を生成と共に0〜4までの数値で初期化してください。(1行で書くこと)
		int[] aryInt = { 0, 1, 2, 3, 4 };

		// (2)上記で作成した配列の中身を普通のfor文で表示させてください。
		// この際、要素の間はスペース区切りで横並びで表示させてください。
		// 表示例：0 1 2 3 4
		for (int i = 0; i < aryInt.length; i++) {
			System.out.print(aryInt[i] + " ");
		}

		System.out.println(); // 改行する

		// (3)要素数が10個のString型配列を生成し、
		// その後、配列の0番目と5番目に自分の名前を代入してください。
		String[] aryString = new String[10];
		aryString[0] = "太郎";
		aryString[5] = "太郎";

		// (4)上記で作成した配列の中身を拡張for文で表示させてください。
		// この際、要素の間はスペース区切りで横並びで表示させてください。
		// また、配列の要素内がnullなら「空」と表示させてください、
		for (String name : aryString) {
			if (name != null) {
				System.out.print(name + " ");
			} else {
				System.out.print("空" + " ");
			}
		}
		
	}
}