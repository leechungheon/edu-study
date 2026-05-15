package day6;

class Toy {
	int num;	
	void printThis() {
		System.out.println(this);
	}
}

public class ThisTest {
	public static void main(String[] args) {
		Toy obj = new Toy();
		System.out.println(obj);
		obj.printThis();
	}
}
