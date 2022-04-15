package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int workTime = sc.nextInt();
		int pay, overPay;
		
		if(workTime<=8) {
			pay = workTime*10000;
			System.out.println("임금은 "+pay+"원 입니다.");
		}else {
			overPay = (workTime-8)*12000;
			pay = 80000+overPay;
			System.out.println("임금은 "+pay+"원 입니다.");
		}
		
		sc.close();

	}

}
