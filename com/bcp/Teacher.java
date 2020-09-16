public final class Teacher {
	public final String name;
	private final int teacherID;
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 10;

	public Teacher(final String name, final int teacherID) {
		this.name = name;
		this.teacherID = teacherID;
	}	

	public boolean addCourse(String course) {

		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}

	public boolean removeCourse(String course) {

		int courseIndex = numCourses;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courseIndex = i;
				break;
			}
		}
		if (courseIndex == numCourses) {
			return false;
		} else {
			for (int i = courseIndex; i < numCourses - 1; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		}
	}

}