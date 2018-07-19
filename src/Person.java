
public class Person {
	
	//Fields
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	//No-arg constructor
	Person(){}
	
	//Value Constructor
	Person(String name, String address, String phoneNumber, String emailAddress) {
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
	}
	
	//name getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//address getter/setter
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//phoneNumber getter/setter
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//emailAddress getter/setter
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	//toString() override
	public String toString() {
		return "Person: " + name;
	}

}
