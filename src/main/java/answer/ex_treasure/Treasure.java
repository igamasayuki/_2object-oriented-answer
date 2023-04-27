package answer.ex_treasure;

public class Treasure {

	static final int NORTH = 1;
	static final int EAST = 2;
	static final int SOUTH = 3;
	static final int WEST = 4;
	int treasureX = 0;
	int treasureY = 0;
	int hereX = 0;
	int hereY = 0;
	int direction = NORTH;
	int score = 100;

	void startGame() {
		treasureX = (int) Math.random() * 20 - 10;
		treasureY = (int) Math.random() * 20 - 10;
		System.out.println("宝探しゲームを開始します。");
	}

	void go() {
		if (direction == NORTH) {
			hereY++;
		} else if (direction == EAST) {
			hereX++;
		} else if (direction == SOUTH) {
			hereY--;
		} else if (direction == WEST) {
			hereX--;
		}
		System.out.println("移動しました。");
	}

	void goRight() {
		direction++;
		if (direction == 5) {
			direction = NORTH;
		}
		System.out.println("向きを変えました。");
		go();
	}

	void goLeft() {
		direction--;
		if (direction == 0) {
			direction = WEST;
		}
		System.out.println("向きを変えました。");
		go();
	}

	void back() {
		direction = direction - 2;
		if (direction == 0) {
			direction = WEST;
		} else if (direction == -1) {
			direction = SOUTH;
		}
		System.out.println("向きを変えました。");
		go();
	}

	boolean search() {
		if (distanceX() < -2) {
			System.out.println("もっと西にありそうだ。");
		} else if (distanceX() < 0) {
			System.out.println("もう少し西にありそうだ。");
		} else if (distanceX() == 0) {
		} else if (distanceX() < 2) {
			System.out.println("もっと東にありそうだ。");
		} else if (distanceX() > 2) {
			System.out.println("もう少し東にありそうだ。");
		}

		if (distanceY() < -2) {
			System.out.println("もっと南にありそうだ。");
		} else if (distanceY() < 0) {
			System.out.println("もう少し南にありそうだ。");
		} else if (distanceY() == 0) {
		} else if (distanceY() < 2) {
			System.out.println("もう少し北にありそうだ。");
		} else if (distanceY() > 2) {
			System.out.println("もっと北にありそうだ。");
		}

		if (distanceX() == 0 && distanceY() == 0) {
			System.out.println("宝を見つけた！");
			return true;
		}
		score--;
		return false;
	}

	void showDirection() {
		switch (direction) {
		case NORTH:
			System.out.println("北を向いている");
			break;
		case EAST:
			System.out.println("東を向いている");
			break;
		case SOUTH:
			System.out.println("南を向いている");
			break;
		case WEST:
			System.out.println("西をむいている");
			break;
		default:
			break;
		}
		score = score - 5;
	}

	int distanceX() {
		return treasureX - hereX;
	}

	int distanceY() {
		return treasureY - hereY;
	}
}
