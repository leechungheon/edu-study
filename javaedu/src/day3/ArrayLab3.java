package day3;

public class ArrayLab3 {

	public static void main(String[] args) {
		char[] cArr = {'J','a','v','a'};
		
		for(int i=0; i<4; i++) {
			if(cArr[i]<97) {
				cArr[i]+=32;
			}else {
				cArr[i]-=32;
			}
		}
		for(char c : cArr) {
			System.out.println(c);
		}
	}

}
