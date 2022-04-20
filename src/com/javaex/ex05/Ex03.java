package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] nums = new int[6];
	  //주소  주소명 /도킹/ 주소지, 방 개수(*개수 정하지 않으면 오류남) 
	  //접근하기 위해 만드는 영역 / 개발자가 접근할 수 없는 영역
	  //스택         / 힙
		
		/*
		nums[0] = (int)(Math.random()*45)+1; **단 방 번호는 0부터 시작됨**
		nums[1] = (int)(Math.random()*45)+1;
		nums[2] = (int)(Math.random()*45)+1;
		nums[3] = (int)(Math.random()*45)+1;
		nums[4] = (int)(Math.random()*45)+1;
		nums[5] = (int)(Math.random()*45)+1;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		*/
		
		for(int i = 0; i<6; i++) {
			nums[i] = (int)(Math.random()*45)+1;
		}

		for(int i = 0; i<nums.length; i++) { //nums.length는 방 개수를 적용해 줌 / 주소명.length
			System.out.println(nums[i]);
		}

	}

}
