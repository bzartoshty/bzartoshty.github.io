import java.util.Objects;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 20, 21, 22
 * Assumptions: ID is non-null, nonblank, and immutable. Name and Address are non-null immutable values. Student name/address references can be replaced.
 */
public class Student {
    private final String studentID;
    private Name name;
    private Address address;

    public Student() {
        this(new Name(), "UNASSIGNED", new Address());
    }

    public Student(Name name, String studentID, Address address) {
        if (studentID == null || studentID.trim().isEmpty()) {
            throw new IllegalArgumentException("Missing ID");
        }
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
        this.studentID = studentID.trim();
    }

    public String getStudentID() { return studentID; }
    public Name getName() { return name; }
    public Address getAddress() { return address; }

    public void setName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void setAddress(Address address) {
        this.address = Objects.requireNonNull(address);
    }
    @Override
    public String toString() { return studentID + ": " + name; }
}
