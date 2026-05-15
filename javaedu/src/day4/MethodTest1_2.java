package day4;

public class MethodTest1_2 {
	public static void main(String[] args) {
		System.out.println(getSum(100, 200));
		int r1 = getSum(10, 20);
		System.out.println("결과값 : " + r1);
		
		System.out.println(getAvg(r1, 30));
		double r2 = getAvg(15, 20);
		System.out.println(r2);
		System.out.println((int)r2);
	}
	static int getSum(int num1, int num2) {
		return num1+num2;
	}
	static double getAvg(double num1, double num2) {
		return (num1+num2)/2;
	}
}
