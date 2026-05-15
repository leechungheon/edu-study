package extraexam;

interface Sample {
	int calc(int n);
}

class MyTest {
	static void pr(Sample p) {
		System.out.println(p.calc(10));
	}
}

public class LambdaTest1 {
	public static void main(String[] args) {
		// 구현체
		class SampleImpl implements Sample {
			public int calc(int n) {
				return n + 1;
			}
		}
		Sample obj = new SampleImpl();
		MyTest.pr(obj);

		// 익명 클래스
		MyTest.pr(new Sample() {
			public int calc(int n) {
				return n + 10;
			}
		});

		// 람다식
		MyTest.pr((int n) -> {
			return n + 100;
		});
		MyTest.pr((n) -> {
			return n + 100;
		});
		MyTest.pr(n -> {
			return n + 100;
		});
		MyTest.pr(n -> n + 100);
	}
}
