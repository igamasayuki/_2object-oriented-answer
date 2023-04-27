package answer;

public class Ex12ElectricCar {
	int battery; // バッテリー残量
	boolean power; // 電源

	void powerOn() { // 電源を入れる
		if (battery <= 0) { //　追加演習にて追加
			System.out.println("充電してください");
			return; // メソッドがここで終わり呼び出し元に処理が移る
		}
		power = true;
	}

	void powerOff() { // 電源を切る
		power = false;
	}

	void chargeToFull() { // 満充電する
		battery = 100;
	}

	void move(String place) { // 指定場所へ移動する
		if (!power) { // power == falseと同じ意味
			System.out.println("電源を入れてください");
			return; // メソッドがここで終わり呼び出し元に処理が移る
		}

		System.out.println(place + "へ移動しました");
		battery = battery - 50;

		// バッテリー残量が0以下なら電源を切る
		if (battery <= 0) {
			battery = 0;
			power = false;
		}
	}
}
