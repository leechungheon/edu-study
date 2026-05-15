package day1;

public class VariableTest5 {
	public static void main(String[] args) {
		int num1=40;
		int num2=41;
		int result = num1+num2;
		System.out.println(result);
		System.out.println((double)result);
		System.out.println((char)result);
		
		char munja1='('; // 40
		char munja2=')'; // 41
		char result2 = '@';
		System.out.println(result2);
		result2 = (char)(munja1 + munja2); // int형보다 작으면 int형으로 형변환 되기 때문에 강제 형변환해야함
		System.out.println(result2);
	}
}
