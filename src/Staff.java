import java.util.Date;

public class Staff extends Employee {
	
	//Fields
	private String title;
	
	//No-arg Constructor
	Staff(){}
	
	//Value Constructor
	Staff(String name, String address, String phoneNumber, String emailAddress, String officeNumber, String salary, Date dateHired, String title) {
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
		setOfficeNumber(officeNumber);
		setSalary(salary);
		setDateHired(dateHired);
		setTitle(title);
	}

	//title getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//Override toString()
	public String toString() {
		return "Staff: " + getName();
	}

}
