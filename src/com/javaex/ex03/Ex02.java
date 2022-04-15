package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수는: ");
		int score = sc.nextInt();
		
		if(score>=60) {
			System.out.println("합격입니다.");  //true일 때만 실행되는 영역
		}else {
			System.out.println("불합격입니다."); //false일 때만 실행되는 영역
		}
		
		sc.close();
		
	}

}
