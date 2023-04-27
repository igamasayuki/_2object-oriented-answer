package answer;

public class Ex03 {
  public static void main(String[] args) {
    Ex03Human yamada = new Ex03Human();
    yamada.lastName = "山田";
    yamada.firstName = "太郎";
    yamada.sayMyName();
    yamada.eat("おにぎり");

    Ex03Human sato = new Ex03Human();
    sato.lastName = "佐藤";
    sato.firstName = "一郎";
    sato.sayMyName();
    sato.eat("カレー");
  }
}
