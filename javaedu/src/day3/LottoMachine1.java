package day3;

public class LottoMachine1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int idx = 0;
		while(true) {
			boolean duplicate = false;
			if(idx>=6)break;
			int newNum = (int)(Math.random()*45)+1;
			for(int currentNum : lotto) {
				if(newNum==currentNum) {
					duplicate = true;
				}
			}
			if(!duplicate) {
				lotto[idx]=newNum;
				idx++;
			}
			
		}
		System.out.println("[ 출력형식 ]");
		System.out.printf("오늘의 로또 번호 - %d, %d, %d, %d, %d, %d", lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
	}

}
