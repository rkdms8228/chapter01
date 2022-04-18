package com.javaex.ex04;

public class Ex09 {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		while(true) {
			if(i%6==0 && i%14==0) { //조건이 되면 탈출
				//if문이 true일 때
				System.out.println(i);
				break;
			}
			i++;
			
		}
		
	}

}
