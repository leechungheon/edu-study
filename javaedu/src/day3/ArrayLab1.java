package day3;

public class ArrayLab1 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		for(int i=0; i<10; i++) {
			System.out.print(ary[i]+" ");
			ary[i]=10*(i+1);
		}
		System.out.println();
		System.out.println("첫 번째 : "+ary[0]);
		System.out.println("마지막 : "+ary[9]);
		System.out.println("합 : "+(ary[0]+ary[9]));
		for(int n : ary) {
			System.out.print(n+" ");
		}
		System.out.println();
		for(int i=9; i>=0; i--) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			if(i%2==1)System.out.print(ary[i]+" ");
		}
	}

}
