package org.o7planning.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_SQLJDBC {
	// Kết nối vào SQL Server.
	// (Sử dụng thư viện SQLJDBC)
	public static Connection getSQLServerConnection_SQLJDBC() //
			throws ClassNotFoundException, SQLException {

		// Chú ý: Thay đổi các thông số kết nối cho phù hợp.
		String hostName = "QUANGDT-HO";
		String sqlInstanceName = "SQLEXPRESS";
		String database = "mytest";
		String userName = "sa";
		String password = "123456";

		return getSQLServerConnection_SQLJDBC(hostName, sqlInstanceName,
				database, userName, password);
	}

	// Kết nối tới SQLServer, sử dụng thư viện SQLJDBC.
	private static Connection getSQLServerConnection_SQLJDBC(
			String hostName, //
			String sqlInstanceName, String database, String userName,
			String password)//
			throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Cấu trúc URL Connection dành cho SQLServer
		// Ví dụ:
		// jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
		String connectionURL = "jdbc:sqlserver://" + hostName + ":50187" //
				+ ";instance=" + sqlInstanceName + ";databaseName=" + database;

		Connection conn = DriverManager.getConnection(connectionURL, userName,
				password);
		return conn;
	}

	public static void main(String[] args) {
		try {
			new SQLServerConnUtils_SQLJDBC().getSQLServerConnection_SQLJDBC();
			System.out.println("Connection Successed");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
