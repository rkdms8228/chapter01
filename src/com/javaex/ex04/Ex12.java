package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("종료.");
		
		System.out.println("================");
		
		for(int i = 1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				//아무것도 안 한다
			}else {
				System.out.println(i);
			}
		
		}
		System.out.println("================");
		
		for(int i = 1; i<=20; i++) {
			if( !(i%2==0 || i%3==0) ) { //!는 반대
				System.out.println(i);
			}
		
		}
		
	}

}
