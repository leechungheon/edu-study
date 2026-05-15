package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int total = 0;
		for(int i=0; i<10; i++) {
			num[i] = (int)(Math.random()*17)+4;
			total+=num[i];
		}
		System.out.print("모든 원소의 값 : ");
		for(int i=0; i<10; i++) {
			System.out.print(num[i]);
			if(i!=9)System.out.print(",");
		}
		System.out.println();
		System.out.print("모든 원소의 합 : "+total);
	}

}
