package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/

		int intArray[] = new int[] {3, 6, 9}; //방의 초기화를 적어 줌(간단 초기화식)
		//int intArray[] = {3, 6, 9};
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("===============");
		
		double[] dArray = new double[3];
		
		dArray[0] = 1.1;
		dArray[1] = 7.3;
		dArray[2] = 5.2;
		
		for(int i = 0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
		}

		System.out.println("===============");
		
		char[] cArray = new char[6];
		
		cArray[0] = '안';
		cArray[1] = '녕';
		cArray[2] = '하';
		cArray[3] = '세';
		cArray[4] = '요';
		cArray[5] = '!'; //*문자 아닌 숫자를 넣으면 기본값 A로 세팅됨
		
		for(int i = 0; i<cArray.length; i++) {
			System.out.print(cArray[i]);
		}
		
	}

}
