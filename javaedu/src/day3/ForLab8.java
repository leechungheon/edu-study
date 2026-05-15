package day3;

public class ForLab8 {

	public static void main(String[] args) {
		final char STAR = '*';
		for(int i=0; i<7; i++) {
			for(int j=i; j<7; j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
	}

}
