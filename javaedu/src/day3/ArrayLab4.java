package day3;

public class ArrayLab4 {

	public static void main(String[] args) {
		int[] iArr = new int[(int)(Math.random()*6)+5];
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = (int)(Math.random()*26)+1;
		}
		
		char[] cArr = new char[iArr.length];
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = (char)(iArr[i]+96);
		}
		
		System.out.println("[ 출력형식 ]");
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i]);
			if(i!=iArr.length-1)System.out.print(",");
		}
		System.out.println();
		for(int i=0; i<cArr.length; i++) {
			System.out.print(cArr[i]);
			if(i!=cArr.length-1)System.out.print(",");
		}
	}

}
