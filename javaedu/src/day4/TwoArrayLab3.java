package day4;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int[][] timeTable = {
				{5,2,1,0,2,3,6},
				{4,3,2,1,1,0,5},
				{3,1,2,1,3,1,3},
				{4,3,1,0,4,2,7}
		};
		char[] days = {'일','월','화','수','목','금','토'};
		
		int sum;
		for(int i=0; i<timeTable[0].length; i++) {
			sum = 0;
			for(int j=0; j<timeTable.length; j++) {
				sum+=timeTable[j][i];
			}
			System.out.printf("%c요일 : %d시간\n", days[i], sum);
		}
		
		System.out.println();
		for(int i=0; i<timeTable.length; i++) {
			sum = 0;
			for(int j=0; j<timeTable[i].length; j++) {
				sum += timeTable[i][j];
			}
			System.out.printf("%d주차 : %d시간\n", i+1, sum);
		}
	}

}
