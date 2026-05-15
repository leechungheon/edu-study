package day7;

class A{
	A(){
		System.out.println("A 클래스의 생성자가 호출됨~~");
	}
}

class B extends A{
	B(int num){
		System.out.println("B 클래스의 생성자가 호출됨~~");
	}
}

class C extends B{
	C(){
		super(10);
		System.out.println("C 클래스의 생성자가 호출됨~~");
	}
}
public class ABCTest {

	public static void main(String[] args) {
		new C();
	}

}
