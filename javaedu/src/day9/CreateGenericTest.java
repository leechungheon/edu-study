package day9;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.put("DUKE1");
		String name = v1.get();
		System.out.println(name);
		
		Value2 v2 = new Value2();
		v2.put("DUKE2");
		name = (String) v2.get();
		System.out.println(name);
		v2.put(new Date());
		Date now = (Date) v2.get();
		System.out.println(now);
		
		Value3<String> v3 = new Value3<String>();
		Value3<Date> v4 = new Value3<Date>();
		
		//v3.put(new Date()); -> 제너릭스는 바로 컴파일 에러를 표시한다.
		v3.put("DUKE3");
		name = v3.get(); // 제너릭스는 강제 형변환이 필요 없다.
		System.out.println(name);
		v4.put(new Date());
		now = v4.get(); // 제너릭스는 강제 형변환이 필요 없다.
		System.out.println(now);
	}
}

class Value1{
	String obj;
	void put(String obj) {
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}

class Value2{
	Object obj;
	void put(Object obj) {
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}

class Value3<T>{  
	T obj;
	void put(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}