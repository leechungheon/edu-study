package day4;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] += 10+2*cnt;
				cnt++;
			}
		}
		System.out.println("1행 1열의 데이터 : "+ arr[0][0]);
		System.out.println("3행 4열의 데이터 : "+ arr[2][3]);
		System.out.println("행의 갯수 : "+ arr.length);
		System.out.println("행의 갯수 : "+ arr[0].length);
		System.out.print("3행의 데이터들 : ");
		for(int i=0; i<arr[2].length; i++) {
			System.out.print(arr[2][i]+" ");
		}
		System.out.print("\n2열의 데이터들 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i][1]+" ");
		}
		System.out.print("\n왼쪽 대각선 데이터들 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i][i]+" ");
		}
		System.out.print("\n오른쪽 대각선 데이터들 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i][arr.length-1-i]+" ");
		}
	}

}
