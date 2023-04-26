package jp.co.aforce.practice;

import java.util.Calendar;
import java.util.HashSet;

public class PracticeTest5 {
	public static void main(String[] args) {
	//練習問題２
	HashSet<String>animal = new HashSet<>();
	
	animal.add("犬");
	animal.add("猫");
	animal.add("うさぎ");
	animal.add("へび");
	
	//練習問題３
	String myAnimal = "人";
		if(animal.add(myAnimal) == false) {
			System.out.println(myAnimal + "はリストに含まれています");
		}else {
			System.out.println(myAnimal + "はリストに含まれていません");
		}
		
	//練習問題４
		Calendar calendar = Calendar.getInstance();
		int todayMonth = calendar.get(Calendar.MONTH);

		switch(todayMonth + 1){
		case 1:
			System.out.println("冬物セール");
			break;
		case 2,3,4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("春物セール");
			break;
		case 6,7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10,11,12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
			break;
		}
	}
}
