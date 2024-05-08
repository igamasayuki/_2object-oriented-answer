package com.example.answer.ex_equipent;

public class Main {

	public static void main(String[] args) {

		Equipment equipmente = new Equipment();
		equipmente.showItems();
		equipmente.showStatus();
		equipmente.equip(equipmente.weaponLowName);
		equipmente.showStatus();
		equipmente.equip(equipmente.weaponMidName);
		equipmente.showStatus();
		equipmente.equip(equipmente.weaponHiName);
		equipmente.showStatus();

	}

}
