package day3;

public class ForLab10 {

	public static void main(String[] args) {
		int rnd = (int)(Math.random()*2)+1;
		for(int i=rnd; i<=9; i+=2) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d \t", i,j,i*j);
			}
			System.out.println();
		}
	}
}
