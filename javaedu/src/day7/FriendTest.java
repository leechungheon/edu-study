package day7;

public class FriendTest {

	public static void main(String[] args) {
		Friend[] f = new Friend[5];
		f[0] = new Friend("유재석", "010-1234-5678", "aaaa@naver.com");
		f[1] = new Friend("노홍철", "010-1111-2222", "bbbb@naver.com");
		f[2] = new Friend("정형돈", "010-5555-7777", "cccc@naver.com");
		f[3] = new Friend("정준하", "010-8989-9898", "dddd@naver.com");
		f[4] = new Friend("박명수", "010-7777-7777", "eeee@naver.com");
		
		System.out.println("이름 \t 전화번호 \t    메일주소");
		System.out.println("---------------------------------------");
		for(Friend friend : f) {
			System.out.println(friend.getInfo());
		}
	}

}
