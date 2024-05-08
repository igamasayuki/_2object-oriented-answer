package com.example.answer;

public class Ex01Car {
  int speed; // 速度を表す属性
  String name; // 車名を表す属性
  int gasoline; // ガソリン残量を表す属性

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
  void refuel(int newGasoline) {
    // ガソリンを引数で受け取った分だけ増やす
    gasoline = gasoline + newGasoline;
  }


}