package sample.chapter1;

public class PassByValue {
  public static void main(String[] args) {
    int num = 10;
    add10(num); // numという基本データ型の変数を渡す
    System.out.println("main()メソッド内の値：" + num);
  }

  static void add10(int newNum) {
    newNum = newNum + 10;
    System.out.println("add10()メソッド内の値：" + newNum);
  }
}
