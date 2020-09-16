public final class Student {
	public final String name;
	private final int studentID;
	private int numCourses;
	private String[] courses;
	private int[] grades;

	public Student(final String name, final int studentID) {
		this.name = name;
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public int getstudentID() {
		return studentID;
	}	
	
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double) sum / numCourses;
	}
}
