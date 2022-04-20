package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		//방의 값이 똑같을 때 같은 방의 값을 가져와 따로 갖는 경우**
		
		int[] arrayA = new int[3];
		
		arrayA[0] = 3;
		arrayA[1] = 6;
		arrayA[2] = 9;
		
		int[] arrayB = new int[3];
		
		/*
		arrayB[0] = arrayA[0];
		arrayB[1] = arrayA[1];
		arrayB[2] = arrayA[2];
		*/
		
		for(int i = 0; i<arrayA.length; i++) {
			arrayB[i] = arrayA[i];
		}
		
		//*출력*
		for(int i = 0; i<arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		
		System.out.println("===============");
		
		for(int i = 0; i<arrayB.length; i++) {
			System.out.println(arrayB[i]);
		}
		
		System.out.println("===============");
		
		//A값 변경 후 확인
		arrayA[1] = 100;
		
		for(int i = 0; i<arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		
		System.out.println("===============");
		
		for(int i = 0; i<arrayB.length; i++) {
			System.out.println(arrayB[i]);
		}

	}

}
