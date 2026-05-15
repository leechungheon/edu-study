package day6;

class AcademyFriend{
	static String academyName = "KOSA";
	private String name;
	private String color;
	private String hobby;
	private String food;
	
	AcademyFriend(String name, String color, String hobby, String food){
		this.name = name;
		this.color = color;
		this.hobby = hobby;
		this.food = food;
	}
	
	String getName() {
		return name;
	}
	
	String getColor() {
		return color;
	}
	
	String getHobby() {
		return hobby;
	}
	
	String getFood() {
		return food;
	}
}
public class AFTest {

	public static void main(String[] args) {
		AcademyFriend[] af = new AcademyFriend[5];
		af[0] = new AcademyFriend("이충헌", "검정", "달리기", "치킨");
		af[1] = new AcademyFriend("이민호", "파랑", "독서", "피자");
		af[2] = new AcademyFriend("이현석", "파랑", "헬스", "김치찌개");
		af[3] = new AcademyFriend("남지호", "핑크", "요리", "된장찌개");
		af[4] = new AcademyFriend("김은수", "회색", "게임", "라멘");
		
		for(int i=0; i<5; i++) {
			System.out.printf("%s 동료는 좋아하는 칼라가 %s이며 취미는 %s입니다. 그리고 제일 좋아하는 음식은 %s 입니다. 지금은 %s에서 GenAI 기반 풀스택 인공지능 서비스 개발 전문가 과정을 학습하고 있어요.\n", af[i].getName(), af[i].getColor(), af[i].getHobby(), af[i].getFood(), AcademyFriend.academyName);
		}
	}

}
