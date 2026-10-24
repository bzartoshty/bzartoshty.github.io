/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 28
 */
public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("COMP 110", 2);
        Student ada = new Student(
            new Name("Ada"), "100", new Address());
        Student grace = new Student(
            new Name("Grace"), "101", new Address());
        course.addStudent(ada);
        course.addStudent(grace);
        System.out.println(course);
        for (Student student : course.getStudents()) {
            System.out.println(student);
        }
        course.dropStudent("100");
        System.out.println(course.getNumberOfStudents());
    }
}
