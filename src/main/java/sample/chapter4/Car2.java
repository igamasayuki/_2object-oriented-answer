package sample.chapter4;

public class Car2 {
  // 全車種共通の最高速度(static変数＆定数)
  static final int MAX_SPEED = 180;
  // 走行速度
  int speed;

  // 走る
  void stepOnAccele() {
    // 非staticメソッドでstatic変数を利用することはできる
	  speed = speed + 10; // 速度を10増やす
    // 最高速度以上出ないようにする
    if (speed > MAX_SPEED) {
      speed = MAX_SPEED;
    }
  }

  // 車の最高速度を表示するstaticメソッド
  static void showMaxSpeed() {
    // staticメソッド内はstatic変数しか利用できない
    System.out.println("全車種共通の最高速度は" + MAX_SPEED + "です");
    // System.out.println("現在の速度は" + speed + "です");
  }
}
