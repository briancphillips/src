public final class Grades {
    private final String name;    
    private int numGrades;
    private int[] grades;

    public Grades(final String name) {
        this.name = name;

    }    

    public synchronized void printGrades() {
        System.out.print(this);
        for (int i = 0; i < numGrades; ++i) {
            System.out.print(grades[i]);
        }
        System.out.println();
    }    
    

}