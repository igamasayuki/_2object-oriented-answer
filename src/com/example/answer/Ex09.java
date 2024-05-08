package com.example.answer;

public class Ex09 {
  public static void main(String[] args) {
    String[] friends = { "一郎", "次郎", "三郎", "四郎", "五郎", "六郎", "七郎" };

    for (int i = 0; i < friends.length; i++){
      String friend = friends[i];
      System.out.println(friend + "さん");
    }

    System.out.println("==============");

    for (String friend : friends){
      System.out.println(friend + "さん");
    }
  }
}
