package extraexam;

//@FunctionalInterface 
interface Test2 {
	void run();

	void print();
}

public class LambdaTest4 {
	public static void main(String[] args) {
		Test2 test = new Test2() {
			@Override
			public void run() {
				System.out.println("run");
			}

			@Override
			public void print() {
				System.out.println("print");
			}
		};
		test.run();
		test.print();
	}
}
