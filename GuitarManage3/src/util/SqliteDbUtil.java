package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteDbUtil {
	public static final String url = "jdbc:sqlite://c:/guitar.db";
	public static final String name = "org.sqlite.JDBC";

	public static void main(String[] args)
	{
		Connection conn = SqliteDbUtil.getConnection();
		// tester.add();
		System.out.println(conn);// 测试链接
	}

	public static Connection getConnection()
	{
		try
		{
			Class.forName(name);
			return DriverManager.getConnection(url);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void closeConnection(Connection conn)
	{
		if (conn != null)
		{
			try
			{
				conn.close();
			} catch (SQLException e)
			{
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}
}