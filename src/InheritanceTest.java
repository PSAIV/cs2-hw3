//Demonstrates inheritance properties within the various classes and subclasses included in this repo
import java.util.Date;

public class InheritanceTest {
	
	public static void main(String args[]) {
		
		Person p = new Person("John", "111 Main St", "555-1234", "john@mail.com");
		Student stu = new Student("James", "121 Somewhere Rd", "555-9876", "james@mail.com", "Freshman");
		Date d = new Date();
		Employee e = new Employee("Joseph", "8000 Real Dr", "555-2348", "joseph@mail.com", "1.102", "$30000", d);
		Faculty f = new Faculty("Jonas","174 Actual Ave", "555-3284", "jonas@mail.com", "2.201", "$75000", d, "M/W/F 3:00PM-4:45PM", "Senior Instructor");
		Staff sta = new Staff("Jeff","2222 Fake St", "555-9630", "jeff@mail.com", "2.502", "$29000", d, "Advisor");
		
		System.out.printf("%s\n%s\n%s\n%s\n%s", p.toString(), stu.toString(), e.toString(), f.toString(), sta.toString());
	}
}
