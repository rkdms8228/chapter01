package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

		/*									 //random은 double형으로 나오기 때문에 int로 변환이 필요
		int num = (int)(Math.random()*10)+1; //1-10까지의 랜덤 숫자를 받고 싶을 때
		System.out.println(num);             //*10은 double형을 정수로 받기 위해 (최대값)
		*/									 //+1은 0제거 및 10을 받기 위해 (최소값)
		
		//로또 번호 자동 생성 6개 (1-45)
		int num1, num2, num3, num4, num5, num6;
		
		num1 = (int)(Math.random()*45)+1;		
		num2 = (int)(Math.random()*45)+1;		
		num3 = (int)(Math.random()*45)+1;		
		num4 = (int)(Math.random()*45)+1;		
		num5 = (int)(Math.random()*45)+1;
		num6 = (int)(Math.random()*45)+1;
		
		
		System.out.print(num1+"  ");
		System.out.print(num2+"  ");
		System.out.print(num3+"  ");
		System.out.print(num4+"  ");
		System.out.print(num5+"  ");
		System.out.println(num6);
		
		System.out.println("===================");
		
		for(int i = 1; i<=6; i++) {
			System.out.println(i);
		}
		
	}

}
