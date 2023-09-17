package StudentManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagementSystem {
	static Scanner scanner = new Scanner(System.in);

	public void addStudent() throws SQLException {
		Connection con = Helper.getConnect();
		PreparedStatement ps = con.prepareStatement("insert into student(rollNumber, name, grade)values(?,?,?)");

		System.out.print("\nEnter Roll Number: ");
		int rollNumber = scanner.nextInt();
		System.out.print("Enter Name: ");
		String name = scanner.next();
		System.out.print("Enter Grade: ");
		String grade = scanner.next();

		ps.setInt(1, rollNumber);
		ps.setString(2, name);
		ps.setString(3, grade);
		ps.execute();

		System.out.println("Student added successfully");
	}

	public void removeStudent() throws SQLException {
		Connection con = Helper.getConnect();
		PreparedStatement ps = con.prepareStatement("delete from student where rollNumber=?");

		System.out.print("\nEnter Roll Number to remove student: ");
		int rollNo = scanner.nextInt();

		ps.setInt(1, rollNo);
		ps.execute();

		System.out.println("Student removed succesfully");
	}

	public void searchStudent() throws SQLException {
		Connection con = Helper.getConnect();
		PreparedStatement ps = con.prepareStatement("select * from student where rollNumber=?");
		System.out.print("\nEnter Roll Number: ");
		int rollNumber = scanner.nextInt();
		ps.setInt(1, rollNumber);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			System.out.println("\nRoll Number: " + rs.getInt(1));
			System.out.println("Name: " + rs.getString(2));
			System.out.println("Grade: " + rs.getString(3));
		} else {
			System.out.println("Student not found");
		}
	}

	public void updateName() throws SQLException {
		Connection con = Helper.getConnect();
		PreparedStatement ps = con.prepareStatement("update student set name=? where rollNumber=?");

		System.out.print("\nEnter Roll Number: ");
		int rollNumber = scanner.nextInt();
		System.out.print("Enter updated Name: ");
		String name = scanner.next();

		ps.setString(1, name);
		ps.setInt(2, rollNumber);
		ps.execute();
		System.out.println("Name is updated");
	}

	public void updateGrade() throws SQLException {
		Connection con = Helper.getConnect();
		PreparedStatement ps = con.prepareStatement("update student set grade=? where rollNumber=?");

		System.out.print("\nEnter Roll Number: ");
		int rollNumber = scanner.nextInt();
		System.out.print("Enter updated Grade: ");
		String grade = scanner.next();

		ps.setString(1, grade);
		ps.setInt(2, rollNumber);
		ps.execute();
		System.out.println("Grade is updated");
	}

	public void displayAllStudents() throws SQLException {
		Connection con = Helper.getConnect();
		PreparedStatement ps = con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("\nRoll Number: " + rs.getInt(1));
			System.out.println("Name: " + rs.getString(2));
			System.out.println("Grade: " + rs.getString(3));
		}
	}
}
