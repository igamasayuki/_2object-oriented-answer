package com.example.sample.chapter1;

public class PassByReference {
  
  public static void main(String[] args) {
    Car car = new Car();
    car.speed = 10;
    addSpeed10(car); // carという参照型の変数を渡す
    System.out.println("main()メソッド内のspeedの値：" + car.speed);
  }

  static void addSpeed10(Car newCar) {
    newCar.stepOnAccele(); // アクセルを踏む
    System.out.println("addSpeed10()メソッド内のspeedの値：" + newCar.speed);
  }
}
