package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자의 기본 &&
		System.out.println("&& 연산자");
		System.out.println(true&&true);   //True
		System.out.println(true&&false);  //False
		System.out.println(false&&true);  //False
		System.out.println(false&&false); //False
		
		//논리 연산자의 기본 ||
		System.out.println("|| 연산자");
		System.out.println(true||true);   //True
		System.out.println(true||false);  //True
		System.out.println(false||true);  //True
		System.out.println(false||false); //False
		
		System.out.println("응용");
		System.out.println( (a>b)&&(a<b) ); //(F) && (T) --> F
		System.out.println( (a>b)&&(a>b) ); //(F) && (F) --> F
		System.out.println( (a<b)&&(a<b) ); //(T) && (T) --> T
		
		System.out.println("==========");
		System.out.println( (a>b)||(a<b) ); //(F) || (T) --> T
		System.out.println( (a<b)||(a>b) ); //(T) || (F) --> T
		System.out.println( (a>b)||(a>b) ); //(F) || (F) --> F
		
		//논리 연산자 기본 !
		System.out.println("==========");
		System.out.println(a>b);      //5>7 --> F
		System.out.println( !(a>b) ); //!False --> True
		
		System.out.println("==========");
		System.out.println(a<b);      //5<7 --> T
		System.out.println( !(a<b) ); //!True --> False
	}

}
