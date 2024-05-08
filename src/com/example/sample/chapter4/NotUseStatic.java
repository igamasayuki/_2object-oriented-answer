package com.example.sample.chapter4;

public class NotUseStatic {
  public static void main(String[] args) {
    Car estima = new Car(); // 車「エスティマ」生成
    estima.maxSpeed = 120; // 最高速度を設定
    estima.stepOnAccele(); // 走る(何回走っても120km/h以上出ない)

    Car prius = new Car(); // 車「プリウス」生成
    prius.maxSpeed = 150; // 最高速度を設定
    prius.stepOnAccele(); // 走る (何回走っても150km/h以上出ない)
  }
}
