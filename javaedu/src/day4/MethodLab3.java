package day4;

public class MethodLab3 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			int rnd1 = (int)(Math.random()*30)+1;
			int rnd2 = (int)(Math.random()*30)+1;
			System.out.printf("%d 와 %d 의 차는 %d 입니다. \n", rnd1, rnd2, gap(rnd1, rnd2));
		}
	}

	static int gap(int a, int b) {
		return Math.abs(a-b);
	}
}
