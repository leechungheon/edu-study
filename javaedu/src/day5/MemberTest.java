package day5;

class Member{
	String name;
	String account;
	String passwd;
	int birthyear;
	
	Member(String name, String account, String passwd, int birthyear){
		this.name = name;
		this.account = account;
		this.passwd = passwd;
		this.birthyear=birthyear;
		
		System.out.printf("%s(%s,%s,%d)", this.name, this.account, this.passwd, this.birthyear);
	}
}
public class MemberTest {

	public static void main(String[] args) {
		System.out.print("회원1 : ");
		new Member("짱구","jjg111", "jjg1234",2001);
		System.out.print("\n회원2 : ");
		new Member("철수","cs111", "cs1234",2001);
		System.out.print("\n회원3 : ");
		new Member("맹구","mg111", "mg1234",2001);
	}

}
