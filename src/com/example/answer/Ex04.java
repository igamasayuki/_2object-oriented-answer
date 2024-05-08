package com.example.answer;

public class Ex04 {
  public static void main(String[] args) {
    // エスティマの処理
    Ex04Car estima = new Ex04Car(50,"エスティマ",100);
    estima.display();

    // プリウスの処理
    Ex04Car prius = new Ex04Car(30,"プリウス",20);
    prius.display();

  }
}
