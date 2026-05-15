package day5;

public class MethodTest10 {
	public static void main(String[] args) {
		int[][] nums = new int[5][3];

		// 2차원 배열 출력
		for (int i=0; i < nums.length; i++) {
			for (int j=0; j < nums[i].length; j++)
				System.out.print(nums[i][j]+"\t");
			System.out.println();
		}
		System.out.println();
		int num=1;
		for (int j=0; j < nums[0].length; j++) {
			for (int i=j; i < nums.length-j; i++)
				nums[i][j] = num++;
		}
		
		// 2차원 배열 출력
		for (int i=0; i < nums.length; i++) {
			for (int j=0; j < nums[i].length; j++)
				System.out.print(nums[i][j]+"\t");
			System.out.println();
		}		
	}
}
