package day2;

public class ForLab5 {

	public static void main(String[] args) {
		int evenNum = 0;
		int oddNum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				evenNum+=i;
			}else {
				oddNum+=i;
			}
		}
		
		System.out.println("1부터 100까지의 숫자들 중에서");
		System.out.printf("짝수의 합은 %d 이고\n홀수의 합은 %d 이다.", evenNum, oddNum);
	}

}
