package com.example.answer;

public class Ex02 {
  public static void main(String[] args) {
    // エスティマの処理
    Ex01Car estima = new Ex01Car();
    estima.speed = 50;
    estima.name = "エスティマ";
    estima.stepOnAccele();
    estima.stepOnAccele();
    estima.stepOnBrake();
    System.out.println("エスティマの現在の速度は" + estima.speed + "km/hです。");

    // プリウスの処理
    Ex01Car prius = new Ex01Car();
    prius.speed = 30;
    prius.name = "プリウス";
    prius.stepOnAccele();
    prius.stepOnAccele();
    prius.stepOnAccele();
    prius.stepOnAccele();
    prius.stepOnAccele();
    prius.stepOnBrake();
    prius.stepOnBrake();
    prius.stepOnBrake();
    System.out.println("プリウスの現在の速度は" + prius.speed + "km/hです。");

  }
}
