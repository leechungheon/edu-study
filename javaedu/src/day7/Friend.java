package day7;
class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	
	public String getInfo() {
		return name;
	}
}
public class Friend extends Person{
	private String phoneNum;
	private String email;

	public Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo()+" "+phoneNum+" "+email;
	}
}
