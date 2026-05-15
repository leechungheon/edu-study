package extraexam;

public class Student3 {
	private String name;
	private String gender;
	private int score;

	public Student3(String name, String gender, int score) {
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student3 [name=" + name + ", gender=" + gender + ", score=" + score + "]";
	}	
}