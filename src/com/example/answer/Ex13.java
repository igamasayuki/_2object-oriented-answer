package com.example.answer;

public class Ex13 {
	public static void main(String[] args) {

		Ex13VendingMachine vendingMachine = new Ex13VendingMachine();
		
		// 商品を1個買います
		vendingMachine.buyItem();
		
		// 在庫を3個追加します
		vendingMachine.refillStock(3);
		
		// 商品を1個買います
		vendingMachine.buyItem();
		
		// お金を500円入金します
		vendingMachine.putMoney(500);
		
		// 商品をを3個買います
		vendingMachine.buyItem();
		vendingMachine.buyItem();
		vendingMachine.buyItem();
		
		// 再度、在庫を3個追加します
		vendingMachine.refillStock(3);
		
		// 商品をを3個買います
		vendingMachine.buyItem();
		vendingMachine.buyItem();
		vendingMachine.buyItem();
	}
}