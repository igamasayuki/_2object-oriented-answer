package sample.chapter2;

public class ArraySample {
  public static void main(String[] args) {
    // 最初に配列を作って後から値を入れる方法
    String[] prefectures = new String[4]; // String prefectures[] = new String[4];でも良い

    prefectures[0] = "東京";
    prefectures[1] = "埼玉";
    prefectures[2] = "千葉";
    prefectures[3] = "神奈川";

    // 配列を作ると同時に値を入れる方法
    // String[] prefectures = { "東京", "埼玉", "千葉", "神奈川" };

    // 普通のfor文(あまり使用しない)
    for (int i = 0; i <= 3; i++) {
      System.out.println(prefectures[i]);
    }
    System.out.println("===========");
    // lengthを使用して配列のサイズを取得している使用例
    for (int i = 0; i < prefectures.length; i++) {
      System.out.println(prefectures[i]);
    }
    System.out.println("===========");
    // 拡張for文(こちらに慣れましょう)
    for (String prefecture : prefectures) {
      System.out.println(prefecture);
    }
  }
}
