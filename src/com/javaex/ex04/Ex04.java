package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<=10; i++) {
			sum = sum+i;
		} // 계산식 먼저 써 보고 코드 작성!!! 계산이 맞는지 먼저 대입하고 풀고 나서 코드 대입해야 오류나 문제점 미리 발견하고 재건축 가능
		
		System.out.println("1부터 10까지 정수의 합은 "+sum+"입니다.");
		
	}

}
