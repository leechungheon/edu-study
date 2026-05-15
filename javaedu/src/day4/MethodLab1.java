package day4;

public class MethodLab1 {

	public static void main(String[] args) {
		System.out.print("좋아하는 음식은 ");
		printMyFood();
		System.out.print(" 입니다.\n");
		
		System.out.print("좋아하는 숫자는 "+getMyNumber()+" 입니다.\n");
	}

	static void printMyFood() {
		System.out.print("치킨");
	}
	
	static int getMyNumber() {
		return 9;
	}
}
