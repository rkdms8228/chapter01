package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5]; //(정확한)칸 수 입력 / 원하는 방 개수
		
		intArray[0] = 3; //*단 방 번호는 0부터 시작됨!
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 55;
		
		/*
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		*/
		
		for(int i = 0; i<5; i++) {
			System.out.println(intArray[i]);
		}

	}

}
