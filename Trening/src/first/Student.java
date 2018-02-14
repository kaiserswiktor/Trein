/**
 * 
 */
package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author User
 *
 */
public class Student {

	private String firstName;//
	private String secondName;
	private String thirdName;
	private String dateBirth;
	private String address;
	private int numberPhone;
	private String faculty;
	private int course;

	public Student(String firstName, String secondName, String thirdName, String dateBirth, String address,
			int numberPhone, String faculty, int course) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.dateBirth = dateBirth;
		this.address = address;
		this.numberPhone = numberPhone;
		this.faculty = faculty;
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
     public void seek() throws IOException {
    	 String name;
    	 System.out.println("Enter the second name of student who you want to seek, please!");
    	 BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
    	 name=reader1.readLine();
    	 if(name.equals(secondName)) {
    		
    	 }
     }
	public void show() {
		System.out.println("\t" +"     Student");
		System.out.println("First name "+ "\t" + "-" + "\t" + getFirstName());
		System.out.println("Second name "+ "\t" + "-" + "\t" + getSecondName());
		System.out.println("Third name "+ "\t" + "-" + "\t" + getThirdName());
		System.out.println("Date birth "+ "\t" + "-" + "\t" + getDateBirth());
		System.out.println("address "+ "\t" + "-" + "\t" + getAddress());
		System.out.println("Number phone "+ "\t" + "-" + "\t" + getNumberPhone());
		System.out.println("Faculty "+ "\t" + "-" + "\t" + getFaculty());
		System.out.println("Course  "+ "\t" + "-" + "\t" + getCourse());

	}

}
