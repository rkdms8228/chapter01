package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요[0이면 종료]");
		
		int sum = 0; //합계
		int num;
		
		/*
		do {
			num = sc.nextInt(); //입력값
			sum = sum+num;
			System.out.print("합계: "+sum);
		}while(num != 0);
		*/
		
		System.out.println("================");
		
		while(true) {
			num = sc.nextInt(); //입력값
			sum = sum+num;
			System.out.println("합계: "+sum);
			if(num==0) {
				break;
			}
		}
		
		System.out.println("종료.");
		
		sc.close();

	}

}
