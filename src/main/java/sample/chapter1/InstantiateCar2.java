package sample.chapter1;

public class InstantiateCar2 {
  public static void main(String[] args) {
    // Car2クラスからCar2オブジェクトをインスタンス化
    Car2 car = new Car2(0, "エスティマ");

    // コンストラクタでフィールドの初期化が完了しているため以下の２行はコメントアウト
    // car.speed = 0;
    // car.name = "エスティマ";

    car.stepOnAccele(); // アクセルを踏む
    car.stepOnAccele(); // アクセルを踏む
    car.stepOnBrake(); // ブレーキを踏む

    // 現在の速度を表示する
    System.out.println("現在の速度は" + car.speed + "km/hです。");
  }
}