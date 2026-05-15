package day3;

public class ForLab7 {

	public static void main(String[] args) {
		final char c = '&';
		int rnd = (int)(Math.random()*6)+5;
		String str = String.valueOf(c);
		for(int i=0; i<rnd; i++) {
			System.out.println(str);
			str+=String.valueOf(c);
		}
	}

}
