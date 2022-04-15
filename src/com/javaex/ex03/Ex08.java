package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num>0) {           //양수(짝수, 홀수)
			if(num%2==0) { //짝수
				System.out.println("짝수입니다.");
			}else { //홀수
				System.out.println("홀수입니다.");
			}
		}else if(num<0) {    //음수
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		} // if 중복문
		
		
		/*
		if(num%2==0 && num>=2) {
			System.out.println("짝수입니다.");
		}else if(num%2==1 && num>=1) {
			System.out.println("홀수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		*/ //if 중복문 쓰지 않고 혼자 풀었을 때
		
		sc.close();
		
	}

}
