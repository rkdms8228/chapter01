package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		
		//일반적인 방식
		double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값이 변경되는 경우
		pi=3.1415926;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수로 정의할 경우
		final double PI = 3.14; //상수로 사용할 때는 대문자로 표기
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//*상수의 값을 변경하려고 할 때
		/*PI = 3.1415926; //PI가 상수로 선언되어 변경되지 않는다
		double result04 = PI*5*5;
		System.out.println(result04);*/
	}

}
