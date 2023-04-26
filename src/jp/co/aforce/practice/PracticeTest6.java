package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		Random random = new Random();
		
	int fortune = random.nextInt();
	
	switch(fortune) {
	case 1:
		System.out.println("吉です");
		break;
	case 2:
		System.out.println("中吉です");
		break;
	case 3:
		System.out.println("大吉です");
		break;
	default:
		System.out.println("凶です");
		break;
	}
	
	//練習問題２
	for(int i = 1; i <= 100 ;i++) {
		if(i % 7 == 0) {
			System.out.print(i + ",");
		}
	}
	
	System.out.println("");
	//練習問題３
	for(int i = 1; i <= 9 ; i++) {
		for(int k = 1; k <= 9; k++) {
			int j = i * k;
			
			System.out.print( " " );
			if(10 > j) {
				System.out.print( " " );
			}
			System.out.print(j);
		}
		System.out.println();
	}
	}
}

