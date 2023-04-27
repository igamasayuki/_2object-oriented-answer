package answer;

public class Ex05Human {
  String lastName;
  String firstName;
  int power;

  Ex05Human() {
  }

  Ex05Human(String lastName, String firstName, int power) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.power = power;
  }

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

  public String toString() {
    return lastName + firstName + "さんのパワーは" + power + "です";
  }

}
