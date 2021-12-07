package model.dataccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public final String URL = "jdbc:postgresql://localhost:5432/authentication";
	public final String USER = "postgres";
	public final String PWD = "Winter005#";
	
	public Connection credentialVerification() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PWD);
		return conn;
	}
}
