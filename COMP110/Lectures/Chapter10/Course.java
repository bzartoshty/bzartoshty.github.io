import java.util.Arrays;
import java.util.Objects;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 23, 24, 25, 26, 27
 * Assumptions: Course names are nonblank, capacity is positive, and stored students have distinct immutable IDs. Arrays and elements supplied to constructors/setStudents are non-null. Returned arrays copy references but share Student objects.
 */
public final class Course {
    private static final int DEFAULT_CAPACITY = 30;
    private String courseName;
    private Student[] students;
    private int size;

    public Course(String name) { this(name, DEFAULT_CAPACITY); }

    public Course(String name, int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Invalid capacity");
        }
        courseName = requiredName(name);
        students = new Student[capacity];
    }

    public Course(String name, Student[] initial) {
        this(name, Math.max(DEFAULT_CAPACITY, initial.length));
        for (Student student : initial) addStudent(student);
    }

    public String getCourseName() { return courseName; }
    public int getNumberOfStudents() { return size; }

    public void setCourseName(String name) {
        courseName = requiredName(name);
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, size);
    }

    private static String requiredName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Missing course name");
        }
        return name.trim();
    }

    public void addStudent(Student student) {
        Objects.requireNonNull(student);
        if (indexOf(student.getStudentID()) >= 0) {
            throw new IllegalArgumentException("Duplicate ID");
        }
        if (size == students.length) {
            throw new IllegalStateException("Course is full");
        }
        students[size++] = student;
    }

    private int indexOf(String studentID) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentID().equals(studentID)) return i;
        }
        return -1;
    }

    public boolean dropStudent(String studentID) {
        int index = indexOf(studentID);
        if (index < 0) return false;
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        students[--size] = null;
        return true;
    }

    public boolean dropStudent(Student student) {
        return dropStudent(student.getStudentID());
    }

    public void setStudents(Student[] list) {
        Course replacement = new Course(courseName,
            Math.max(DEFAULT_CAPACITY, list.length));
        for (Student student : list) replacement.addStudent(student);
        students = replacement.students;
        size = replacement.size;
    }

    @Override
    public String toString() {
        return courseName + " (" + size + " students)";
    }
}
