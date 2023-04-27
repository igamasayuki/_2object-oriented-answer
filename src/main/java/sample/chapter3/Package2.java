package sample.chapter3;

public class Package2 {
	public static void main(String[] args) {
		// 本来はFQCN表記でなければ、他のクラスは使用できない
		java.lang.String name = "山田";

		// 本来はFQCN表記でなければ、他のクラスは使用できない
		sample.chapter1.Car car = new sample.chapter1.Car();
	}
}
