package org.o7planning.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_JTDS {
	// Kết nối vào SQLServer.
	// (Sử dụng thư viện điều khiển JTDS)
	public static Connection getSQLServerConnection_JTDS() //
			throws SQLException, ClassNotFoundException {

		// Chú ý: Thay đổi các thông số kết nối cho phù hợp.
		String hostName = "QUANGDT_HO";
		String sqlInstanceName = "SQLEXPRESS";
		String database = "mytest";
		String userName = "sa";
		String password = "123456";

		return getSQLServerConnection_JTDS(hostName, sqlInstanceName, database,
				userName, password);
	}

	// Kết nối tới SQL Server sử dụng thư viện JTDS.
	private static Connection getSQLServerConnection_JTDS(
			String hostName, //
			String sqlInstanceName, String database, String userName,
			String password) throws ClassNotFoundException, SQLException {

		Class.forName("net.sourceforge.jtds.jdbc.Driver");

		// Cấu trúc URL Connection đối với SQL Server:
		// Ví dụ:
		// jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS
		String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":50187/" //
				+ database + ";instance=" + sqlInstanceName;

		Connection conn = DriverManager.getConnection(connectionURL, userName,
				password);
		return conn;
	}

	public static void main(String[] args) {
		try {
			new SQLServerConnUtils_JTDS().getSQLServerConnection_JTDS();
			System.out.println("Connection success!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
