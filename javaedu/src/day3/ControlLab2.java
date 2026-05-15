package day3;

public class ControlLab2 {

	public static void main(String[] args) {
		int cnt = 0;
		while(true) {
			int rnd = (int)(Math.random()*11)+10;
			if(rnd%3==0 || rnd%5==0) {
				cnt++;
				int total = 0;
				for(int i=1; i<=rnd; i++)total+=i;
				System.out.println("1부터 "+rnd+"까지의 합: "+total);
				continue;
			}else if(rnd==11 || rnd==17 || rnd==19) {
				System.out.println(cnt+"회 반복함");
				break;
			}else {
				System.out.println("재수행");
				continue;
			}
		}
	}

}
