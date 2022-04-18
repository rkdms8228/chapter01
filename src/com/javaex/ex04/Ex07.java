package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		//y축 세로 반복
		for(int y = 1; y<=6; y++) { // 세로
			//x축 가로 반복
			for(int x = 1; x<=6; x++) { // 가로
				System.out.print("*");
			}
			//가로 반복이 끝나고 줄 바꿈
			System.out.println(); // 줄 바꿈	
		}
		
		/*
		for(int i = 1; i<7; i++) {
			System.out.println("******");
		}
		*/
		
	}

}
