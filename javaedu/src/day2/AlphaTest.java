package day2;

public class AlphaTest {

	public static void main(String[] args) {
		int num = (int)(Math.random()*26)+1;
		System.out.println(num+"이 추출된 경우라면");
		System.out.println("\t추출된 숫자 : "+num);
		System.out.println((char)(num+64));
	}

}
