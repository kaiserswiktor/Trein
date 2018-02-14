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
public class CommandFirst {
	public void command() throws NumberFormatException, IOException {
		Student student1 = new Student("Sergei", "Sergeev", "Seergeevich", "19.01.1991", "Minsk", 333333333, "energy",
				3);
		Customer customer1 = new Customer("Sergei", "Sergeev", "Seergeevich", "Gomel", 12345678, 987654321);
		int x = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (x != 9) {
			if (x == 0) {
				System.out.println("1-work with data base students");
				System.out.println("2-work with data base customers ");
				System.out.println("9-off");
			}
			x = Integer.parseInt(reader.readLine());

			if (x == 1) {
				System.out.println("3-show student");
				System.out.println("0-back");
			}
			if (x == 3) {

				student1.show();
			}

			if (x == 2) {
				System.out.println("4-show customer");
				System.out.println("0-back");
			}
			if (x == 4) {
				customer1.show();
			}
		}
	}

}
