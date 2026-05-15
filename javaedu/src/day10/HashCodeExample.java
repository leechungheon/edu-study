package day10;

public class HashCodeExample {

	public static void main(String[] args) {
		Name obj1 = new Name("길동", "고");
        Name obj2 = new Name("길동", "고");
        int hash1 = obj1.hashCode();
        int hash2 = obj2.hashCode(); // object의 hashCode() 호출되어 해당 객체의 참조값 전달
        System.out.println(hash1);
        System.out.println(hash2);
        
        String obj3 = new String("길동고");
        String obj4 = new String("길동고");
        int hash3 = obj3.hashCode();
        int hash4 = obj4.hashCode(); // String의 오버라이딩한 hashCode() 호출됨
        System.out.println(hash3);
        System.out.println(hash4);
        
        Integer obj5 = Integer.valueOf(100);
        Integer obj6 = Integer.valueOf(100);
        int hash5 = obj5.hashCode();
        int hash6 = obj6.hashCode();
        System.out.println(hash5);
        System.out.println(hash6);       
	}
}
