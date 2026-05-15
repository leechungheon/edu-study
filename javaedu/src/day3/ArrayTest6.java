package day3;
public class ArrayTest6 {
	public static void main(String[] args) {
		int nums[] = { 10, 5, 7, 6, 21, 3, 22, 18, 9, 2, 25, 14 };

		// 첫번째 원소부터 마지막 원소까지 하나의 행에 공백을 분리자로 해서 출력
		for(int i=0; i < nums.length; i++) // traditional for
			System.out.print(nums[i]+" ");
		System.out.println();
		for(int d : nums) // enhanced for(for each) JAVA 5
			System.out.print(d+" ");
		System.out.println();
			
		//  모든 원소들의 합을 구해서 sumV 라는 변수에 담고 출력
		int sumV = 0;
		for(int i=0; i < nums.length; i++) 
			sumV += nums[i];
		System.out.println("\n"+sumV);	
		sumV = 0;
		for(int d : nums)
			sumV += d;
		System.out.println(sumV);		
		
		// 원소값이 짝수인 원소들의 합을 구해서 evenSumV 라는 변수에 담고 출력
		int evenSumV = 0;
		for(int i=0; i < nums.length; i++) 
			if (nums[i] % 2 == 0)
				evenSumV += nums[i];
		System.out.println("\n"+evenSumV);
		evenSumV = 0;
		for(int d : nums) 
			if (d % 2 == 0)
				evenSumV += d;
		System.out.println(evenSumV);
	}
}
