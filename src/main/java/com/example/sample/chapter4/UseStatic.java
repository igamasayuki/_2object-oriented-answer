package com.example.sample.chapter4;

public class UseStatic {
	public static void main(String[] args) {
		Car2 estima = new Car2(); // 車「エスティマ」生成
		estima.stepOnAccele(); // オブジェクト内のメソッドは今まで通り呼び出せる
		// エスティマの最高速度を表示(警告が出る)
		System.out.println(estima.MAX_SPEED); // 警告
		estima.showMaxSpeed(); // 警告

		Car2 prius = new Car2(); // 車「プリウス」生成
		prius.stepOnAccele(); // オブジェクト内のメソッドは今まで通り呼び出せる
		// プリウスの最高速度を表示(警告が出る)Ï
		System.out.println(prius.MAX_SPEED); // 警告
		prius.showMaxSpeed(); // 警告

		// static変数を利用
		System.out.println(Car2.MAX_SPEED); // 車の最高速度を表示
		// staticメソッドの呼び出し
		Car2.showMaxSpeed(); // 車の最高速度を表示

		
	}
}
