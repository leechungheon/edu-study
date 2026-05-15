package day2;

public class ForLab6 {

	public static void main(String[] args) {
		int rnd1 = (int)(Math.random()*8)+3;
		int rnd2 = (int)(Math.random()*3)+1;
		
		if(rnd2 == 1) {
			for(int i=1; i<=rnd1; i++)
				System.out.print("*");
		}else if(rnd2==2) {
			for(int i=1; i<=rnd1; i++)
				System.out.print("$");
		}else if(rnd2==3) {
			for(int i=1; i<=rnd1; i++)
				System.out.print("#");
		}else {
			System.out.print("error");
		}
	}

}
