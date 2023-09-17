package StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	public static Connection getConnect() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "root");
		return con;

	}
}
