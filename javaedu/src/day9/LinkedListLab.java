package day9;

import java.util.LinkedList;
import java.util.List;

import day7.Friend;

public class LinkedListLab {
	public static void main(String[] args) {
		List<Friend> list = new LinkedList<>();
		list.add(new Friend("유재석", "010-1234-5678", "aaaa@naver.com"));
		list.add(new Friend("노홍철", "010-1111-2222", "bbbb@naver.com"));
		list.add(new Friend("정형돈", "010-5555-7777", "cccc@naver.com"));
		list.add(new Friend("정준하", "010-8989-9898", "dddd@naver.com"));
		list.add(new Friend("박명수", "010-7777-7777", "eeee@naver.com"));
		
		System.out.println("이름 \t 전화번호 \t    메일주소");
		System.out.println("---------------------------------------");
		for(Friend friend : list) {
			System.out.println(friend.getInfo());
		}
	}
}
