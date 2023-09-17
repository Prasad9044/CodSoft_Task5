package StudentManagementSystem;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		StudentManagementSystem managementSystem = new StudentManagementSystem();

		for (;;) {
			System.out.println("\nStudent Management System");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student Details");
			System.out.println("5. Display All Students");
			System.out.println("6. Exit");
			System.out.print("\nEnter your choice: ");

			switch (scanner.nextInt()) {
			case 1: {
				managementSystem.addStudent();
			}
				break;
			case 2: {
				managementSystem.removeStudent();
			}
				break;
			case 3: {
				managementSystem.searchStudent();
			}
				break;
			case 4: {
				System.out.println("1.Update Name 2.Update Grade");
				System.out.print("Enter your choice: ");
				switch (scanner.nextInt()) {
				case 1: {
					managementSystem.updateName();
					break;
				}
				case 2: {
					managementSystem.updateGrade();
					break;
				}
				}
			}
				break;

			case 5: {
				managementSystem.displayAllStudents();
				break;
			}
			case 6: {
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			}
			default: {
				System.out.println("Invalid choice. Please choose again.");
			}
			}
		}
	}
}
