package day9;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLab {
	public static final int NUM = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<NUM; i++) {
			String name;
			while(true) {
				System.out.print("나라이름을 입력하세요 : ");
				name = sc.next();
				if(map.containsKey(name)) {
					System.out.printf("*나라명 %s는 이미 저장되었습니다.* \n", name);
				}else {
					break;
				}
			}
			
			System.out.print("인구 수를 입력하세요 : ");
			int population = sc.nextInt();
			
			map.put(name, population);
			System.out.println("*저장되었습니다.*");
		}
		sc.close();
		System.out.printf("%d개가 모두 입력되었습니다. \n", NUM);
		System.out.print("입력된 데이터 : ");
		int i=0;
		for(String key: map.keySet()) {
			i++;
			System.out.print(key+"("+map.get(key)+")");
			if(i!=NUM)System.out.print(",");
		}
	}

}
