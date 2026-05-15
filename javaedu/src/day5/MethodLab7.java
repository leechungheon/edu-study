package day5;

public class MethodLab7 {

	public static void main(String[] args) {
		System.out.printf("호출 1 : %d \n", addEven(10,2,5,13,7));
		System.out.printf("호출 2 : %d \n", addEven(11, 22, 33, 44, 55, 66));
		System.out.printf("호출 3 : %d \n", addEven());
		System.out.printf("호출 4 : %d \n", addEven(100, 101, 103));
	}

	static int addEven(int... arr) {
		int evenTotal = 0;
		for(int n : arr) {
			if(n%2==0)evenTotal+=n;
		}
		return arr.length==0?-1:evenTotal;
	}
}
