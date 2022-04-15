package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A등급");
		}else if(90>score && score>=80) { //앞의 && AND 연산자 와 90>score을 쓰지 않아도 90이상의 값은 포함되지 않음
			System.out.println("B등급");
		}else if(80>score && score>=70) {
			System.out.println("C등급");
		}else if(70>score && score>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		
		/*
		if(score>=90) {
			System.out.println("A등급");
		}else if(score>=80) {
			System.out.println("B등급");
		}else if(score>=70) {
			System.out.println("C등급");
		}else if(score>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		 */ //&& AND 연산자 쓰지 않고 혼자 풀었을 때
		
		/* && AND 연산자
		 90>score && score>=80
		 90>85 && 85>=80 --> T&&T --> T 85점일 때
		 90>75 && 75>=80 --> F&&F --> F 85점일 때
		*/
		
		sc.close();
		
	}

}
