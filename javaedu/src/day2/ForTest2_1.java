package day2;

public class ForTest2_1 {
	public static void main(String[] args) {
		 double rand;
		 
		 for(int num=10; num > 0; num--) { 
			    rand = Math.random();
		 		System.out.println(rand);
		 		System.out.println(rand*6);
		 		System.out.println((int)(rand*6));
		 		System.out.println("------------------");
		 }
	}
}
