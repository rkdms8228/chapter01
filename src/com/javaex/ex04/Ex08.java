package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		// y, x 축이 똑같이 늘어나는 경우  /  for문 안에 if문 들어갈 수 있음
		for(int y = 1; y<=6; y++) { // 세로
			
			for(int x = 1; x<=y; x++) { // 가로
				System.out.print("*");
			}
			System.out.println(); // 줄 바꿈
		}

	}

}
