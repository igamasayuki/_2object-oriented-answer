package answer.ex_equipment;

public class Equipment {

	String weaponLowName = "ひのきのぼう";
	String weaponMidName = "どうのつるぎ";
	String weaponHiName = "レイピア";
	int weaponLowAttack = 7;
	int weaponMidAttack = 12;
	int weaponHiAttack = 24;
	int strength = 5;
	String equipment = "";

	void showItems() {
		System.out.println("どうぐ:");
		System.out.println(weaponLowName);
		System.out.println(weaponMidName);
		System.out.println(weaponHiName);
		System.out.println();
	}

	int calcAttack() {
		if (equipment.equals(weaponLowName)) {
			return strength + weaponLowAttack;
		} else if (equipment.equals(weaponMidName)) {
			return strength + weaponMidAttack;
		} else if (equipment.equals(weaponHiName)) {
			return strength + weaponHiAttack;
		}
		return strength;
	}

	void showStatus() {
		System.out.println("こうげき力 " + calcAttack());
		System.out.println();
	}

	void equip(String weapon) {
		if (weapon.equals(weaponLowName) || weapon.equals(weaponMidName) || weapon.equals(weaponHiName)) {
			int oldAttack = calcAttack();
			equipment = weapon;
			System.out.println(weapon + "を装備した。");
			System.out.println("こうげき " + oldAttack + " → " + calcAttack());
			System.out.println();
		}
	}
}
