package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		int rnd = (int)(Math.random()*6)+5;
		
		System.out.println("[ for 결과 ]");
		for(int i=1; i<=rnd; i++) {
			System.out.printf("%d -> %d\n", i,i*i);
		}

		System.out.println("[ while 결과 ]");
		int num = 0;
		while(num<rnd) {
			num++;
			System.out.printf("%d -> %d\n", num,num*num);
		}
	}

}
