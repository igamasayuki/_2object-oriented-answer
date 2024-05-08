package com.example.sample.chapter3;

// 車を表すクラス部品用のクラス
public class Car {
	int speed; // 速度を表す属性
	String name; // 車名を表す属性

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