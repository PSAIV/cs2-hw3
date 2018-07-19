import java.util.Date;

public class Employee extends Person {
	
	//Fields
	private String officeNumber;
	private String salary;
	private Date dateHired;
	
	//no-arg Constructor
	Employee(){}
	
	//Value Constructor
	Employee(String name, String address, String phoneNumber, String emailAddress, String officeNumber, String salary, Date dateHired) {
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
		setOfficeNumber(officeNumber);
		setSalary(salary);
		setDateHired(dateHired);
	}

	//officeNumber getter/setter
	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	//salary getter/setter
	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	//dateHired getter/setter
	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	//Override toString()
	public String toString(){
		return "Employee: " + getName();
	}
	

}
