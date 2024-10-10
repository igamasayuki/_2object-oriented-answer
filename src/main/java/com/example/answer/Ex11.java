package com.example.answer;

public class Ex11 {
  public static void main(String[] args) {

    int addAnswer = Ex11Calculation.addition(5, 3);
    System.out.println("足し算の結果:" + addAnswer);

    int subAnswer = Ex11Calculation.substraction(5, 3);
    System.out.println("引き算の結果:" + subAnswer);

    int multiAnswer = Ex11Calculation.multiplication(5, 3);
    System.out.println("掛け算の結果:" + multiAnswer);

    int divAnswer = Ex11Calculation.division(5, 3);
    System.out.println("割り算の結果:" + divAnswer);

    int remainAnswer = Ex11Calculation.remainder(5, 3);
    System.out.println("剰余の結果:" + remainAnswer);

  }
}
