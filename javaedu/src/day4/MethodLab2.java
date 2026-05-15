package day4;

public class MethodLab2 {

	public static void main(String[] args) {
		System.out.printf("10은 "+(isEven(10)?"짝수":"홀수")+" 입니다.\n");
		System.out.printf("13은 "+(isEven(13)?"짝수":"홀수")+" 입니다.\n");
	}

	static boolean isEven(int num) {
		return num%2==0;
	}
}
