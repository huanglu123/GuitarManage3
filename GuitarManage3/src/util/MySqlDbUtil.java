package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySqlDbUtil {
	public static final String url="jdbc:mariadb://localhost:3306/guitar";
	public static final String name = "org.mariadb.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "123";

	public static Connection conn = null;

	public static void main(String[] args) {
		Connection conn = MySqlDbUtil.getConnection();
		// tester.add();
		System.out.println(conn);// ≤‚ ‘Mysqlµƒ¡¨Ω”
	}

	public static Connection getConnection() {
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public void close() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}