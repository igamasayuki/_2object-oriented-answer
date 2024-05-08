package com.example.answer;

public class Ex04Car {
  int speed; // 速度を表す属性
  String name; // 車名を表す属性
  int gasoline; // ガソリン残量を表す属性

  // 引数なしコンストラクタ
  public Ex04Car() {
  }

  // 引数ありコンストラクタ
  public Ex04Car(int speed, String name, int gasoline) {
    this.speed = speed;
    this.name = name;
    this.gasoline = gasoline;
  }

  // アクセルを踏む操作
  void stepOnAccele() {
    speed = speed + 10; // 速度を10増やす
    gasoline = gasoline - 10; // ガソリンを10減らす
  }

  // ブレーキを踏む操作
  void stepOnBrake() {
    speed = speed - 10; // 速度を10減らす
  }

  // 給油する操作
  void refuel(int newGasoine) {
    // ガソリンを引数で受け取った分だけ増やす
    gasoline = gasoline + newGasoine;
  }

  // フィールド変数の中身をコンソールに出力する
  void display() {
    System.out.println(name + "の速度は" + speed + "km/hでガソリン残量は" + gasoline + "リットルです");
  }
}
