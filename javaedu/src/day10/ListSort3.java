package day10;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person3 {
	public String name;
	public int age;

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {		
		return name+"("+age+")";
	}	
}

class Person3Comparator implements Comparator<Person3> {
	@Override
	public int compare(Person3 o1, Person3 o2) {
		if (o1.age < o2.age)
			return -1;
		else if (o1.age > o2.age)
			return 1;
		else 
			return 0;
	}	
}

public class ListSort3 {
	public static void main(String[] args) {
		List<Person3> list = new LinkedList<>();
		
		for(int i=1; i <= 10; i++) {
			list.add(new Person3("duke"+i, new Random().nextInt(30)));
		}

		System.out.println(list);
		list.sort(new Person3Comparator());
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);
	}
}
