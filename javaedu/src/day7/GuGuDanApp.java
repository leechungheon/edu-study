package day7;

import day4.MethodLab4;

public class GuGuDanApp {

	public static void main(String[] args) {
		int dan = MethodLab4.getRandom(1, 20);
		int number = MethodLab4.getRandom(1, 20);
		
		//System.out.println("dan: "+dan+"\tnumber: "+number);
		
		GuGuDanExpr ggd;
		
		if(dan>=1 && number>=1 && dan<=9 && number<=9) {
			ggd = new GuGuDanExpr(dan,number);
			System.out.printf("%d * %d = ", dan, number);
			ggd.printPart();
		}else if(dan>=1 && dan<=9 && number>=10) {
			System.out.printf("%d단 : ", dan);
			ggd = new GuGuDanExpr(dan);
			ggd.printPart();
		}else if(dan>=10) {
			GuGuDanExpr.printAll();
		}
	}

}
