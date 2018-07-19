import java.util.Date;

public class Faculty extends Employee {
	
	//Fields
	private String officeHours;
	private String rank;
	
	//no-arg Constructor
	Faculty(){}
	
	//Value Constructor
	Faculty(String name, String address, String phoneNumber, String emailAddress, String officeNumber, String salary, Date dateHired, String officeHours, String rank) {
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
		setOfficeNumber(officeNumber);
		setSalary(salary);
		setDateHired(dateHired);
		setOfficeHours(officeHours);
		setRank(rank);
	}

	//officeHours getter/setter
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	//rank getter/setter
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	//Override toString()
	public String toString() {
		return "Faculty: " + getName();
	}

}
