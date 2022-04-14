package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		double v01 = 5/4; //정수로 써서 정수로 출력됨/하나만 실수로 바꾸어도 1.25로 출력 가능 ex)5.0/4
		System.out.println(v01); //1.25 틀림
		
		double v02 = (double)5 / 4 ;
		System.out.println(v02); //1.25
		
		double v03 = 5 / (double)4 ;
		System.out.println(v03); //1.25
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04); //1.25
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05); //2
	}

}
