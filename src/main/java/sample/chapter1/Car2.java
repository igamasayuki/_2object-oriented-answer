package sample.chapter1;

// 車を表すクラス部品用のクラス
public class Car2 {
	int speed; // 速度を表す属性
	String name; // 車名を表す属性

	// コンストラクタ
	Car2(int newSpeed, String newName) {
		speed = newSpeed; // 引数で受け取った「速度」を自分自身の「速度」に代入
		name = newName; // 引数で受け取った「車名」を自分自身の「車名」に代入
	}

	// // コンストラクタ
	// Car2(int speed, String name) {
	// this.speed = speed;
	// this.name = name;
	// }

	// アクセルを踏む操作
	void stepOnAccele() {
		speed = speed + 10; // 速度を10増やす
		System.out.println("スピードが" + speed + "km/hに増えました");
	}

	// ブレーキを踏む操作
	void stepOnBrake() {
		speed = speed - 10; // 速度を10減らす
		System.out.println("スピードが" + speed + "km/hに減りました");
	}

}