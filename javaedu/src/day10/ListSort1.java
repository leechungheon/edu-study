package day10;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person1  {
	public String name;
	public int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {		
		
		return name+"("+age+")";
	}	
}

public class ListSort1 {
	public static void main(String[] args) {
		List<Person1> list = new LinkedList<>();
		Random rand = new Random();
		for(int i=1; i <= 10; i++) {
			list.add(new Person1("duke"+i, rand.nextInt(30)));
		}

		System.out.println(list);
		
		//Collections.sort(list);
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);	
		Collections.reverse(list);
		System.out.println("\nlist의 데이터들을 내림차순으로 소팅한 결과 : " + list);				
	}
}




