public class Course {
    private String courseName;
    private Student[]  students;
    private int  numberOfStudents = 0;
    private static final int CLASS_SIZE= 50;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new Student[CLASS_SIZE];
    }
    public Course(String courseName, Student[] students) {
        this.courseName = courseName;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(Student student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(Student student) {
        // Left as exercise

    }



    public String toString() {
        String studentsString = courseName +"\n";

        for (int i = 0; i < numberOfStudents; i++) {
            studentsString += students[i].toString() + "\n";
        }
        return studentsString;
    }
}
