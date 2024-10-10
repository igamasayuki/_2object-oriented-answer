package com.example.answer;

public class Ex08 {
  public static void main(String[] args) {
    Ex08TV tv = new Ex08TV(false, 1);
    tv.powerOn();
    tv.setChannel(8);
    tv.display();
    tv.powerOff();

    // 追加演習の処理
    // tv.powerOff();
    // tv.setChannel(8);
    // tv.display();

  }
}
