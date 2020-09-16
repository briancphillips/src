public class Class {
    private final String name;
    private final int id;
    private final Teacher teacher;    
    private final Student student;   

    public Class(final int id, final String name, final Teacher teacher, final Student student) {
        this.id = id;
        this.name = name;        
        this.teacher = teacher;
        this.student = student;
    }
    
    public synchronized void printClasses() {
        System.out.print(this);        
    }

}