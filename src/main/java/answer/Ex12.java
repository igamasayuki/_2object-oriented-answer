package answer;

public class Ex12 {
	public static void main(String[] args) {

		Ex12ElectricCar evCar = new Ex12ElectricCar();
		evCar.chargeToFull(); // 充電する
		evCar.powerOn(); // 電源を入れる
		evCar.move("埼玉"); // 埼玉へ移動する
		evCar.move("東京"); // 東京へ移動する
		evCar.move("茨城"); // 茨城へ移動する
		
		// 追加演習Ex12ElectricCarを修正してから以下を実行
		Ex12ElectricCar evCar2 = new Ex12ElectricCar();
		evCar2.chargeToFull(); // 充電する
		evCar2.powerOn(); // 電源を入れる
		evCar2.move("埼玉"); // 埼玉へ移動する
		evCar2.move("東京"); // 東京へ移動する
		evCar2.move("茨城"); // 茨城へ移動する
		evCar2.powerOn(); // 電源を入れる(追加)
	}

}