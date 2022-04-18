package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해 주세요.");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		int i = 1;  // 초기값
		
		while(i<=9) { // 조건식
			int mt = dan*i;
			System.out.println(dan+" * "+i+" = "+mt);
			i++; // 증감식
		}
		
		
		sc.close();

	}

}
