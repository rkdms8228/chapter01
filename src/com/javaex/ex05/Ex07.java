package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] left = new int[3];
		
		left[0] = 10;
		left[1] = 20;
		left[2] = 30;
		
		int[] right = new int[3];
		
		right[0] = 10;
		right[1] = 20;
		right[2] = 30;
		
		if(left.length==right.length) { //두 배열의 개수 확인
			
			for(int i = 0; i<left.length; i++) { //세부 검사
				
				if(left[i]!=right[i]) {
					System.out.println((i+1)+"번째 값이 다릅니다.");
				}
			}
			
		}else {
			System.out.println("두 배열의 크기가 다릅니다.");
		}

	}

}
