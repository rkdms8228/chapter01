package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		for(int i = 1; i<=9; i++) { // 초기값, 조건식, 증감식
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
		
		sc.close();

	}

}
