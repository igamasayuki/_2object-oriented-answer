package sample.chapter1;

public class InstantiateCar {
  public static void main(String[] args) {
    // CarクラスからCarオブジェクトをインスタンス化
    Car car= new Car();

    car.speed = 0;
    car.name = "エスティマ";

    car.stepOnAccele(); // アクセルを踏む
    car.stepOnAccele(); // アクセルを踏む
    car.stepOnBrake(); // ブレーキを踏む

    // 現在の速度を表示する
    System.out.println("現在の速度は" + car.speed + "km/hです。");
  }
}