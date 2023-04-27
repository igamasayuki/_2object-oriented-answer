package answer.ex_treasure;
import java.util.Scanner;

public class Main {
	
	static final String GO = "g";
	static final String RIGHT = "r";
	static final String LEFT = "l";
	static final String BACK = "b";
	static final String SEARCH = "s";
	static final String DIRECTIOM = "d";
	
	public static void main(String args[]) {
		Treasure treasure = new Treasure();
		treasure.startGame();
		String input = "";
		Scanner s = new Scanner(System.in);
		boolean isFinish = false;
		while (!isFinish) {
			System.out.println(GO +": 向いている方向に1歩進む");
			System.out.println(RIGHT + ": 右を向いて1歩進む");
			System.out.println(LEFT + ": 左を向いて1歩進む");
			System.out.println(BACK + ": 逆を向いて1歩進む");
			System.out.println(SEARCH + ": 宝の位置を探る。現在地点に宝があれば宝を手に入れる。");
			System.out.println(DIRECTIOM + ": 向いている方角を表示する");
			System.out.println("\nキーを入力してください。");
			// コンソールに入力された文字を受け取る。
			input = s.next();
			if (input.equals(GO)) {
				treasure.go();
			} else if (input.equals(RIGHT)) {
				treasure.goRight();
			} else if (input.equals(LEFT)) {
				treasure.goLeft();
			} else if (input.equals(BACK)) {
				treasure.back();
			} else if (input.equals(SEARCH)) {
				isFinish = treasure.search();
			} else if (input.equals(DIRECTIOM)) {
				treasure.showDirection();
			}
		}
		// 入力を終了する。
		s.close();
		System.out.println("スコア: " + treasure.score);
	}
}
