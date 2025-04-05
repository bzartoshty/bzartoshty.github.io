import java.util.Arrays;

public class Student {
	
	private Name student;
	private Address[] address;
	
	public Student() {
		student = null;
		address = new Address[3];
	}
	public Student(Name student, Address[] address) {
		
		this.student = student;
		this.address = address;
	}
	public Name getStudent() {
		return student;
	}
	public void setStudent(Name student) {
		this.student = student;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [student=" + student + ", address=" + Arrays.toString(address) + "]";
	}
	
	
}
