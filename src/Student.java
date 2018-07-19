
public class Student extends Person {
	
	//Fields
	private static String classStatus;
	
	//no-arg Constructor
	
	Student(){}
	
	//Value Constructor
	Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
		setClassStatus(classStatus);
	}

	//classStatus getter/setter
	public static String getClassStatus() {
		return classStatus;
	}

	public static void setClassStatus(String classStatus) {
		Student.classStatus = classStatus;
	}
	
	//toString override
	public String toString(){
		return "Student: " + getName();
	}

}
