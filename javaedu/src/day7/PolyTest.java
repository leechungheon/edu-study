package day7;

import java.util.Date;

public class PolyTest {

	public static void main(String[] args) {
		printInfo("가나다");
		printInfo("abc");
		printInfo(new Date());
		printInfo(new int[10]);
		printInfo(new A()); // ABCTest.java에서 선언된 메서드, 같은 패키지에 있음
		printInfo(new java.io.File("c:/education"));
		printInfo(Integer.valueOf(100));
		printInfo(new Object());
	}

	static void printInfo(Object obj) {
		if(obj instanceof String) {
			System.out.println("String 객체가 전달됨 - "+obj.toString()+" - "+((String)obj).length());
		}else {
			System.out.println("전달된 객체의 클래스명: "+obj.getClass().getName());
		}
	}
}
