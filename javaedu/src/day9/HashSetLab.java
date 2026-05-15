package day9;

import java.util.*;

public class HashSetLab {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<10) {
			int num = (int)(Math.random()*21)+10;
			set.add(num);
		}
		
		System.out.print("오늘의 로또 번호 : ");
		Iterator<Integer> iterator = set.iterator();
		int i = 0;
		while(iterator.hasNext()) {
			i++;
			System.out.print(iterator.next());
			if(i!=10)System.out.print(", ");
		}
	}

}
