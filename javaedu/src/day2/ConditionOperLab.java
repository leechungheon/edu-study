package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		int rnd = (int)(Math.random()*5+1);
		int result = 0;
		if(rnd == 1) {
			result = 300 + 50;
		}else if(rnd == 2) {
			result = 300 - 50;
		}else if(rnd == 3) {
			result = 300 * 50;
		}else if(rnd == 4) {
			result = 300 / 50;
		}else{
			result = 300 % 50;
		}
		System.out.print("결과값 : "+result);
	}

}
