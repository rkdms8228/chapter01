package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		//방의 값이 똑같을 때 같은 방에서 값을 가져오는 경우**
		
		int[] arrayA = new int[3];
		
		arrayA[0] = 3;
		arrayA[1] = 6;
		arrayA[2] = 9;
		
		int[] arrayB = arrayA;
		
		for(int i = 0; i<arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		
		System.out.println("===============");
		
		for(int i = 0; i<arrayB.length; i++) {
			System.out.println(arrayB[i]);
		}
		
		System.out.println("arrayA 2번째 값 변경.");
		
		arrayA[1] = 100;
		
		System.out.println("===============");
		
		for(int i = 0; i<arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}

	}

}
