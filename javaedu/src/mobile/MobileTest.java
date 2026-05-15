package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// 각각의 Mobile 객체를 생성한다
		Mobile m1 = new Ltab("Ltab", 500, "ABC-01");
		Mobile m2 = new Otab("Otab", 1000, "XYZ-20");
		// 생성된 객체의 정보를 출력한다.(printMobile() 호출)
		printTitle();
		printMobile(m1);
		printMobile(m2);
		// 각각의 Mobile 객체에 10분씩 충전을 한다.
		System.out.println("\n[ 10분 충전 ]");
		m1.charge(10);
		m2.charge(10);
		// 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
		printTitle();
		printMobile(m1);
		printMobile(m2);
		// 각각의 Mobile 객체에 5분씩 통화를 한다.
		System.out.println("\n[ 5분 통화 ]");
		m1.operate(5);
		m2.operate(5);
		// 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
		printTitle();
		printMobile(m1);
		printMobile(m2);
	}
	public static void printMobile(Mobile mobile) {
		System.out.printf("%-20s %-20s %-20s\n", mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
	}
	 public static void printTitle() {
		 System.out.printf("%-20s %-20s %-20s\n", "Mobile", "Battery", "OS");
		 System.out.println("------------------------------------------------------------");
	}
}
