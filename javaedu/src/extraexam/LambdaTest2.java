package extraexam;

interface Calculation {
	public int add(int a, int b);
}

public class LambdaTest2 {
	public static void exec(Calculation com) {
		int k = 10;
		int m = 20;
		int value = com.add(k, m);
		System.out.println("덧셈 결과 : " + value);
	}

	public static void main(String[] args) {
		// 익명 클래스
		exec(new Calculation() {
			public int add(int a, int b) {
				return a + b;
			}
		});

		// 람다식
		exec((int a, int b) -> {
			return a + b;
		});
		
		// 매개변수 타입과 리턴, 중괄호를 생략한 람다식
		exec((a, b) -> a*a + b*b);
	}
}




