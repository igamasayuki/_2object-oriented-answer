package com.example.sample.chapter4;

public class Car {
	int speed; // 走行速度
	int maxSpeed; // 最高速度

	// アクセルを踏む
	void stepOnAccele() {
		speed = speed + 10; // 速度を10増やす
		// 最高速度以上出ないようにする
		if (speed > maxSpeed) {
			speed = maxSpeed;
		}
	}
}
