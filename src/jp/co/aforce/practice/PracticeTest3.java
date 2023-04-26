package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {
	//練習問題１	
	String[] goods = {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
	
	//練習問題２
	System.out.println(goods[1]);
	
	//練習問題３
	ArrayList<String> member = new ArrayList<>();
	member.add("山田太郎");
	member.add("鈴木花子");
	member.add("佐藤次郎");
	member.add("山田太郎");
	member.add("高橋三郎");
	
	System.out.println(member.get(2));
	}
}
