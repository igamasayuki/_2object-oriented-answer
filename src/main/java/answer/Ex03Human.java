package answer;

public class Ex03Human {
  String lastName;
  String firstName;
  int power;

  void sayMyName() {
    System.out.println("私の名前は" + lastName + firstName + "です。");
  }

  void eat(String food) {
    if ("おにぎり".equals(food)) {
      power = power + 10;
    } else if ("カレー".equals(food)) {
      power = power + 20;
    } else {
      power = power + 5;
    }
    System.out.println("パワーは" + power + "になりました。");
  }
}
