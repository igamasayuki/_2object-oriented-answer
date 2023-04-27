package answer;

public class Ex13VendingMachine {

	static final int PRICE = 120; // 商品の値段
	int money; // 入金金額
	int stock; // 商品の在庫

	void refillStock(int stock) { // 商品の在庫を補充する
		if (this.stock >= 10) {
			System.out.println("商品がいっぱいです");
			return;
		}

		this.stock =+ stock;
		System.out.println("在庫が" + this.stock + "個になりました");
	}

	void putMoney(int money) { // お金を入れる
		this.money =+ money;
		System.out.println("入金金額が" + this.money + "円になりました");
	}

	void buyItem() { // 商品を購入する

		if (this.stock <= 0) {
			System.out.println("在庫を追加してください");
			return;
		}

		if (this.money <= 0) {
			System.out.println("お金を入れてください");
			return;
		}
		
		if (this.money < PRICE) {
			System.out.println("お金が足りません(現在の残高" + this.money + "円)");
			return;
		}

		System.out.println("商品を購入しました");
		this.stock -= 1;
		this.money -= PRICE;

		if (this.stock == 0) {
			System.out.println("在庫切れになりました");
		}
	}
	
}
