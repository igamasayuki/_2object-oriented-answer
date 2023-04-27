package answer;

public class Ex15Bicycle {

	static final String EAST = "東";
	static final String WEST = "西";
	static final String SOUTH = "南";
	static final String NORTH = "北";

	String bearing;

	void setBearing(String bearing) {
		this.bearing = bearing;
	}

	void turnLeft() {
		if (EAST.equals(bearing)) {
			bearing = NORTH;
		} else if (WEST.equals(bearing)) {
			bearing = SOUTH;
		} else if (SOUTH.equals(bearing)) {
			bearing = EAST;
		} else if (NORTH.equals(bearing)) {
			bearing = WEST;
		} else {
			System.out.println("ありえない方角を向いています");
		}
		System.out.println("左へ曲がったので" + bearing + "を向きました");
	}

	void turnRight() {
		if (EAST.equals(bearing)) {
			bearing = SOUTH;
		} else if (WEST.equals(bearing)) {
			bearing = NORTH;
		} else if (SOUTH.equals(bearing)) {
			bearing = WEST;
		} else if (NORTH.equals(bearing)) {
			bearing = EAST;
		} else {
			System.out.println("ありえない方角を向いています");
		}
		System.out.println("右へ曲がったので" + bearing + "を向きました");
	}

	void display() {
		System.out.println(bearing);
	}
}
