package day4;

public class MethodTest1_1 {
	public static void main(String[] args) {
		System.out.println("[호출 예시1]");
		System.out.println(getMyName());
		System.out.println("[호출 예시2]");
		String name = getMyName();
		System.out.println(name);
		System.out.println(name);
	}
	static String getMyName() {
		return "유니코";
	}
}
