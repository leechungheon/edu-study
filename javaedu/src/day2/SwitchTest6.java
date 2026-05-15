package day2;


public class SwitchTest6 {
	public static void main(String[] args) {
		String level = "회원" + ((int)(Math.random()*3) + 1); 
		
		System.out.printf("[ %s님 ]\n", level);
		switch(level) {
			case "회원1":
				System.out.println("*삭제 가능*");
			case "회원2":
				System.out.println("*수정 가능*");
			case "회원3":
				System.out.println("*읽기 가능*");
		}
	}
}