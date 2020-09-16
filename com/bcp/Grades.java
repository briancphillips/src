public final class Grades {
    private final String name;
    private String[] courses;
    private int numCourses;
    private int[] grades;

    public Grades(String name) {
        this.name = name;

    }    

    public synchronized void printGrades() {
        System.out.print(this);
        for (int i = 0; i < numCourses; ++i) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }    
    

}