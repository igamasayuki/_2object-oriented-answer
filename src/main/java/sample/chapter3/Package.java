package sample.chapter3;

import sample.chapter1.Car;

public class Package {
	public static void main(String[] args) {
		// StringクラスはFQCN表記じゃなくても使えていた
		String name = "山田";

		// 自分が作成したCarクラスはFQCN表記じゃなくても使えていた
		Car car = new Car();
	}
}
