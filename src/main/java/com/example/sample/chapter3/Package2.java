package com.example.sample.chapter3;

public class Package2 {
	public static void main(String[] args) {
		// 本来はFQCN表記でなければ、他のクラスは使用できない
		String name = "山田";

		// 本来はFQCN表記でなければ、他のクラスは使用できない
		com.example.sample.chapter3.Car car = new com.example.sample.chapter3.Car();
	}
}
