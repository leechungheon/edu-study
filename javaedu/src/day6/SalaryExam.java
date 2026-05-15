package day6;

import day4.MethodLab4;

class SalaryExpr{
	int bonus;
	SalaryExpr(){
	}
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	int getSalary(int grade) {
		int result = 0;
		switch (grade){
			case 1:
				result= bonus+100;
				break;
			case 2:
				result= bonus+90;
				break;
			case 3:
				result= bonus+80;
				break;
			case 4:
				result= bonus+70;
				break;
		}
		return result;
	}
}

public class SalaryExam {

	public static void main(String[] args) {
		int month = MethodLab4.getRandom(1,12);
		int grade = MethodLab4.getRandom(1,4);
		SalaryExpr s;
		
		if(month%2==0) {
			s = new SalaryExpr(100);
		}else {
			s = new SalaryExpr();
		}
		System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, s.getSalary(grade));
	}

}
