package com.example.sample.chapter2;

public class ArrayTwoDimensionalSample {
  public static void main(String[] args) {
    int[][] kuku = new int[9][9];

    // 以下のように一つずつ代入することも可能
    kuku[0][0] = 1 * 1;
    kuku[0][1] = 1 * 2;

    // 以下のようにfor文を使用して代入することも可能
    for (int i = 0; i < kuku.length; i++){
      for(int j = 0; j < kuku[i].length; j++){
        // iとjは0から始まっているため計算の時は+1している
        kuku[i][j] = (i + 1) * (j + 1);
      }
    }

    // 二次元配列の九九を表示
    for (int i = 0; i < kuku.length; i++){
      for(int j = 0; j < kuku[i].length; j++){
        int answer = kuku[i][j];
        if(answer < 10){
          // 表示を揃えるため結果が１桁の時は十の位をスペースにする
          System.out.print(" "); 
        }
        System.out.print(answer + " "); // 改行しない
      }
      // 1つの段が終わったら改行する
      System.out.println();
    }
  }
}
