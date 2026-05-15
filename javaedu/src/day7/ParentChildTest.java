package day7;

class Parent {	
	void printInfo() {
		System.out.println("부모입니다");
	}	
}

class Child extends Parent {
	void printInfo() { // Overriding
		super.printInfo();
		System.out.println("자식입니다");
	}	
	public String toString() { // Overriding
		return "Child 객체입니다";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.printInfo();
		System.out.println(obj.toString());
		System.out.println("결과1: "+obj); // 커스텀한 toString이 자동으로 실행됨
		
		Parent obj2 = new Parent();
		System.out.println(obj2.toString());
		System.out.println(obj2);
		System.out.println("결과2: "+obj2);
	}
}
