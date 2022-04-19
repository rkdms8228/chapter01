package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				break; //continue가 들어오면 if에서 설정한 값이 출력되지 않음
			}
			System.out.println(i);
		}
		System.out.println("종료.");
	}

}
