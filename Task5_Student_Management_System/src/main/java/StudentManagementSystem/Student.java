package StudentManagementSystem;

public class Student {
	private int rollNumber;
	private String name;
	private String grade;

	public Student(int rollNumber, String name, String grade) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.grade = grade;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
