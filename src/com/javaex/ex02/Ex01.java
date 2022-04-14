package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "한";
		String str = "굿모닝";
		String name = "김가은";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str+str+"안녕하세요");
		System.out.println(str+i);
		String var01 = str+i;
		System.out.println(str+" 랑 "+i);  //공백도 문자로 포함됨
		
		System.out.println(str+d);
		
		System.out.println(i+i);
		System.out.println(d+d);
		System.out.println(i+d);
		
		System.out.println(c);
		System.out.println(c+c); //숫자로 연산됨
		
		System.out.println(s);
		System.out.println(s+s);
		
		System.out.println("제 이름은 "+name+"입니다.");
		
		System.out.println("==========");
		System.out.println("안녕\n하세요");
		System.out.println("안\t녕하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕하\t세요");
		
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요"); //역슬래쉬를 나타내려면 두 번
	}

}
