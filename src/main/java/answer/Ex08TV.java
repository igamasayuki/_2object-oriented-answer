package answer;

public class Ex08TV {

	boolean power;
	int channel;

	Ex08TV() {
	}

	Ex08TV(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
	}

	void powerOn() {
		power = true;
		System.out.println("電源ON");
	}

	void powerOff() {
		power = false;
		System.out.println("電源OFF");
	}

	void setChannel(int newChannel) {
		// 追加演習の処理
		// if(!power){
		// System.out.println("電源を入れてください");
		// return; // ここでメソッドを終わらせる処理
		// }
		channel = newChannel;
	}

	// 以下の形でも問題ありません
//	void setChannel2(int newChannel) {
//		if (!power) {
//			System.out.println("電源を入れてください");
//		} else {
//			channel = newChannel;
//		}
//	}

	void display() {
		// 追加演習の処理
		// if(!power){
		// System.out.println("電源を入れてください");
		// return; // ここでメソッドを終わらせる処理
		// }
		System.out.println("現在" + channel + "チャンネルを表示しています");
	}
	
	// 以下の形でも問題ありません
//	void display() {
//		if (!power) {
//			System.out.println("電源を入れてください");
//		} else {
//			System.out.println("現在" + channel + "チャンネルを表示しています");
//		}
//	}

}
