package day4;

public class TwoArrayTest1 {
	public static void main(String[] args) {
		int[][] score = new int[5][3];
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[0][0]);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
	}
}