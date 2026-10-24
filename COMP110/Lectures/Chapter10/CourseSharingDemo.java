/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 29
 */
public class CourseSharingDemo {
    public static void main(String[] args) {
        Course course = new Course("COMP 110");
        course.addStudent(new Student(
            new Name("Ada"), "100", new Address()));
        Student[] snapshot = course.getStudents();
        snapshot[0].setName(new Name("Grace"));
        snapshot[0] = null;
        System.out.println(course.getStudents()[0].getName());
        System.out.println(course.getNumberOfStudents());
    }
}
