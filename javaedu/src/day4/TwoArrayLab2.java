package day4;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][] arr = {
				{'B', 'C', 'A', 'A'},
				{'C', 'C', 'B', 'B'},
				{'D', 'A', 'A', 'D'}
		};
		int[] number = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]=='A') {
					number[0]++;
				}else if(arr[i][j]=='B') {
					number[1]++;
				}else if(arr[i][j]=='C') {
					number[2]++;
				}else {
					number[3]++;
				}
			}
		}
		
		for(int i=0; i<4; i++) {
			System.out.println((char)(65+i)+" 는 "+number[i]+"개 입니다.");
		}
	}

}
