package answer;

public class Ex15 {
	public static void main(String[] args) {

		Ex15Bicycle bicycle = new Ex15Bicycle();
		//北の方角を向きます
		bicycle.setBearing("北"); 
		//左へ曲がります
		bicycle.turnLeft();
		//右へ曲がります
		bicycle.turnRight();
		//左へ曲がります
		bicycle.turnLeft();
		//左へ曲がります
		bicycle.turnLeft();
		//右へ曲がります
		bicycle.turnRight();
		//左へ曲がります
		bicycle.turnLeft();
		//現在向いている位置を表示します
		bicycle.display();
	}
}