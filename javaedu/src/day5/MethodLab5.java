package day5;

public class MethodLab5 {

	public static void main(String[] args) {
		int[][] iArr = {
				{10,20,30},
				{100,500,300,200,400},
				{1,10,3,4,5,8,7,6,9,2}
		};
		for(int i=0; i<3; i++) {
			System.out.printf("가장 큰 값은 %d 입니다. \n", maxNumArray(iArr[i]));
		}
	}
	
	static int maxNumArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int n: arr) {
			max = Math.max(n, max);
		}
		return max;
	}

}
