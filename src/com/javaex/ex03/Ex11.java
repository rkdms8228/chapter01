package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
				System.out.println("31일입니다.");
				break;
			case 2:
				System.out.println("28일입니다.");
				break;
			case 3:
				System.out.println("31일입니다.");
				break;
			case 4:
				System.out.println("30일입니다.");
				break;
			case 5:
				System.out.println("31일입니다.");
				break;
			case 6:
				System.out.println("30일입니다.");
				break;
			case 7:
				System.out.println("31일입니다.");
				break;
			case 8:
				System.out.println("31일입니다.");
				break;
			case 9:
				System.out.println("30일입니다.");
				break;
			case 10:
				System.out.println("31일입니다.");
				break;
			case 11:
				System.out.println("30일입니다.");
				break;
			default:
				System.out.println("31일입니다.");
				break;
		}
		
		
		/*
		switch(month) {
			case 2:
				System.out.println("28일입니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일입니다.");
				break;
			default:
				System.out.println("31일입니다.");
				break;
		} //switch문 요약했을 때/하지만 추천하지 않음 한두 개쯤은 좋지만 너무 많은 것을 요약하는 것은 좋지 않음
		*/
		
		sc.close();
		
	}

}
