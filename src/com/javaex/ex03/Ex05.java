package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int workTime = sc.nextInt();
		int pay;
		float overPay;
		
		if(workTime<=8) {
			pay = workTime*10000;
			System.out.println("임금은 "+pay+"원 입니다.");
		}else {
			overPay = 10000*1.5F;
			pay = (workTime-8)*(int)overPay+80000;
			System.out.println("임금은 "+pay+"원 입니다.");
		}
		
		sc.close();

	}

}
