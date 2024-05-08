package com.example.answer;

public class Ex14Triathlete {

	String place; // 現在地

	String tool; // ツール

	Ex14Triathlete() {
		this.place = "自宅";
		this.tool = "手ぶら";
	}

	void move(String place) {
		if (place.equals(this.place)) {
			System.out.println("既に" + place + "にいます");
			return;
		}
		System.out.println(this.place + "から" + place + "へ移動しました");
		this.place = place;
	}

	void changeTool(String tool) {
		if (tool.equals(this.tool)) {
			System.out.println("既に" + tool + "を使っています");
			return;
		}
		System.out.println(this.tool + "から" + tool + "にツールを変更しました");
		this.tool = tool;
	}

	void training() {
		System.out.println(this.place + "で" + this.tool + "を使用します");

		if ("海".equals(this.place) && "水着".equals(this.tool)) {
			System.out.println("泳ぎの練習をしました");
		} else if ("サイクリングロード".equals(this.place) && "自転車".equals(this.tool)) {
			System.out.println("自転車の練習をしました");
		} else if ("公園".equals(this.place) && "シューズ".equals(this.tool)) {
			System.out.println("走りの練習をしました");
		} else {
			System.out.println("練習できませんでした");
		}
	}
}
