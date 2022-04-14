package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		//문자열 다음에 숫자열 받을 때 오류나는 경우  
		Scanner sc = new Scanner(System.in);

		//나이(숫자열)
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();

		sc.nextLine();  //***개행문자 처리

		//이름(문자열)
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine();

		System.out.println("당신의 이름은 "+name+" 나이는 "+age +" 입니다.");
		
		sc.close();
	}
}