/**
 * 
 */
package first;

/**
 * @author User
 *
 */
public class Customer {
	private String firstName;
	private String secondName;
	private String thirdName;
	private String address;
	private int numberCard;
	private int numberScore;
	
	public Customer(String firstName,String secondName, String thirdName, String address, int numberCard, int numberScore) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.address = address;
		this.numberCard=numberCard;
		this.numberScore=numberScore;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(int numberCard) {
		this.numberCard = numberCard;
	}

	public int getNumberScore() {
		return numberScore;
	}

	public void setNumberScore(int numberScore) {
		this.numberScore = numberScore;
	}
	public void show() {
		System.out.println("\t" +"     Customer");
		System.out.println("First name "+ "\t" + "-" + "\t" + getFirstName());
		System.out.println("Second name "+ "\t" + "-" + "\t" + getSecondName());
		System.out.println("Third name "+ "\t" + "-" + "\t" + getThirdName());
		System.out.println("address "+ "\t" + "-" + "\t" + getAddress());
		System.out.println("Number card "+ "\t" + "-" + "\t" + getNumberCard());
		System.out.println("Number score  "+ "\t" + "-" + "\t" + getNumberScore());

	}
}
