package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		System.out.println("[ 수행시작 ]");
		int cnt = 0;
		while(true) {
			int rnd = (int)(Math.random()*31);
			if(rnd>=0 && rnd <27) {
				System.out.printf("%d-%c, %d, 0x%x \n", rnd, rnd+64, rnd+64);
				cnt ++;
			}else {
				System.out.printf("[ 수행 종료 ]- 출력횟수는 %d 번 \n", cnt);
				break;
			}
		}
	}

}
